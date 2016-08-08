package com.samboluong.festivalsms.fragment;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.widget.CursorAdapter;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.samboluong.festivalsms.R;
import com.samboluong.festivalsms.bean.SendedMsg;
import com.samboluong.festivalsms.db.SmsProvider;
import com.samboluong.festivalsms.view.FlowLayout;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

//需要注意某些导入的包，都是v4下的

//直接继承ListFragment，免去编写布局文件
public class SmsHistoryFragment extends ListFragment {
    private static final int LOADER_ID = 1;

    private LayoutInflater mInflater;
    private CursorAdapter mCursorAdapter;

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mInflater = LayoutInflater.from(getActivity());

        initLoader();

        setupListAdapter();
    }

    private void setupListAdapter() {
        Log.d("测试", "setupListAdapter-1");

        mCursorAdapter = new CursorAdapter(getActivity(), null, false) {
            //并不是每次都被调用的，它只在实例化view的时候调用,数据增加的时候也会调用
            //但是在重绘(比如修改条目里的TextView的内容)的时候不会被调用
            @Override
            public View newView(Context context, Cursor cursor, ViewGroup parent) {
                return mInflater.inflate(R.layout.item_sended_msg, parent, false);
            }

            //在绘制Item之前一定会调用bindView方法，它在重绘的时候也同样被调用
            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                TextView tvContent = (TextView) view.findViewById(R.id.id_tv_sended_content);
                FlowLayout flContacts = (FlowLayout) view.findViewById(R.id.id_fl_sended_contacts);
                TextView tvFes = (TextView) view.findViewById(R.id.id_tv_fes);
                TextView tvDate = (TextView) view.findViewById(R.id.id_tv_date);

                tvContent.setText(cursor.getString(cursor.getColumnIndex(SendedMsg.COLUMN_CONTENT)));
                tvFes.setText(cursor.getString(cursor.getColumnIndex(SendedMsg.COLUMN_FESTIVAL_NAME)));

                //注意这里的date为long，int型会溢出
                long date = cursor.getLong(cursor.getColumnIndex(SendedMsg.COLUMN_DATE));
                tvDate.setText(parseDate(date));

                String names = cursor.getString(cursor.getColumnIndex(SendedMsg.COLUMN_NAMES));
                if (TextUtils.isEmpty(names)) {
                    return;
                }

                //因为ListView的item有复用的可能性，所以每次都要先除去item中的flContacts在上一次使用时添加的view
                flContacts.removeAllViews();

                for (String name : names.split(",")) {
                    addTag(name, flContacts);
                }
            }
        };

        setListAdapter(mCursorAdapter);
        Log.d("测试", "setupListAdapter-2");
    }

    private String parseDate(long date) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return df.format(date);
    }

    private void addTag(String name, FlowLayout fl) {
        TextView tv = (TextView) mInflater.inflate(R.layout.tag, fl, false);
        tv.setText(name);
        fl.addView(tv);
    }

    private void initLoader() {
        getLoaderManager().initLoader(LOADER_ID, null, new LoaderManager.LoaderCallbacks<Cursor>() {

            //onCreateLoader是一个工厂方法，用来返回一个新的Loader
            //LoaderManager将会在它第一次创建Loader的时候调用该方法
            @Override
            public Loader<Cursor> onCreateLoader(int id, Bundle args) {
                Log.d("测试", "onCreateLoader");
                CursorLoader loader = new CursorLoader(getActivity(), SmsProvider.URI_SMS_ALL, null, null, null, null);
                return loader;
            }

            //onLoadFinished方法将在Loader创建完毕的时候自动调用
            //在数据更新的时候也会调用
            @Override
            public void onLoadFinished(Loader<Cursor> loader, Cursor data) {
                Log.d("测试", "onLoadFinished");
                if (loader.getId() == LOADER_ID) {
                    mCursorAdapter.swapCursor(data);//更新mCursorAdapter的Cursor
                }
            }

            @Override
            public void onLoaderReset(Loader<Cursor> loader) {
                mCursorAdapter.swapCursor(null);
            }
        });
    }
}
