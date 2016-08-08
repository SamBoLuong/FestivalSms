package com.samboluong.festivalsms.bean;

import java.util.ArrayList;
import java.util.List;

public class FestivalLab {
    private static FestivalLab mInstance;

    private List<Festival> mFestivals = new ArrayList<Festival>();

    private List<Msg> mMsgs = new ArrayList<Msg>();

    private FestivalLab() {
        mFestivals.add(new Festival(1, "国庆节"));
        mFestivals.add(new Festival(2, "中秋节"));
        mFestivals.add(new Festival(3, "元旦"));
        mFestivals.add(new Festival(4, "春节"));
        mFestivals.add(new Festival(5, "端午节"));
        mFestivals.add(new Festival(6, "七夕节"));
        mFestivals.add(new Festival(7, "圣诞节"));
        mFestivals.add(new Festival(8, "儿童节"));

        initMsgsContent();
    }

    public void initMsgsContent() {
        mMsgs.add(new Msg(1, 1, "把握时令，创造时运。拼搏奋力，不必卖命，成龙成凤，须有自信。身体要紧，能拼能赢。且吟且行，欢度国庆。"));
        mMsgs.add(new Msg(2, 1, "飞舞的彩带是我的关怀，喧天的锣鼓是我的祝福。国庆佳节到了，祝你全家红红火火，和和美美，开开心心！"));
        mMsgs.add(new Msg(3, 1, "国庆国庆普天同庆，重阳重阳万事不难，在这个和平幸福的年代里，祝你们全家节日快乐！身体健康！"));
        mMsgs.add(new Msg(4, 1, "金秋十月，举国同庆；神州大地，繁花似锦；家和国盛，乐曲如潮，借着这伟大而美丽的日子送上我最诚挚的祝福：天天开心，事事顺意！"));
        mMsgs.add(new Msg(5, 1, "白云从不向天空承诺去留，却朝夕相处；星星从不向暗夜许诺光明，却尽力闪烁；我从不向你倾诉思念，却永远牵挂。国庆快乐！"));
        mMsgs.add(new Msg(6, 1, "国庆快乐，加班快乐！嘻嘻，加班的日子天天快乐，别在意节日怎么过！但我的祝福一直随你一起度过！愿你事业顺利，合家幸福！"));

        mMsgs.add(new Msg(1, 2, "月到中秋分外明，人到中秋共团圆，马上就是中秋节了，我祝你美梦好似月儿圆，美貌堪比月中仙，爱情要比月饼甜，家人一起共团圆。预祝中秋快乐！"));
        mMsgs.add(new Msg(2, 2, "中秋祝福：网缘！情缘！月圆！中秋夜语寄相思，花好月圆情难圆。带去问候和思恋，心想事成愿缘圆。"));
        mMsgs.add(new Msg(3, 2, "一片落叶而知秋，是深秋。一条短信而知秋，是立秋。一轮圆月而知秋，是中秋。朋友你要更坚强，添衣保暖不能忘，幸福快乐伴身旁！中秋快乐！"));
        mMsgs.add(new Msg(4, 2, "月到中秋分外明，秋色明媚月动听，花好月圆人欢庆，温暖康泰万家心。中秋佳节到了，祝你月来月开心，月来月幸福，月来月甜蜜，月来月美丽！"));
        mMsgs.add(new Msg(5, 2, "中秋节到了，情人聚聚增进感情，家人聚聚增进亲情，朋友聚聚增进友情，别忘短信经常句一句，祝大家众情俱增，中秋欢乐！"));
        mMsgs.add(new Msg(6, 2, "今秋又是月圆时，清风只影度中秋，思念佳人千里外，明月传情表我心。祝你中秋节快乐，人月两圆！"));
        mMsgs.add(new Msg(7, 2, "食月饼，赏婵娟，合家欢乐庆团圆；月皎洁，风翩跹，幸福快乐满心田；秋虫鸣，情缱绻，短信祝您中秋节快乐美满。"));
        mMsgs.add(new Msg(8, 2, "中秋祝福：七月七日鹊桥断，八月十五月儿圆.日暖秋凉菩提院，月儿无限月长圆。"));
        mMsgs.add(new Msg(9, 2, "月到中秋了，你我天各一方。岁月流失的都是美好，我会想你，你记得那句话吗？ 明月情依依，繁星语切切。"));

        mMsgs.add(new Msg(1, 3, "元旦快到了！我把收藏好的一月的喜庆，二月的春风，三月的花开，四月的快乐，五月的温馨，六月的纯真，七月的热情，八月的桂香，九月的骄阳，十月的收获，十一月的感恩，十二月的纯洁装进诚意的盒子里，用关怀的蝴蝶结装饰送给你，元旦快乐！"));
        mMsgs.add(new Msg(2, 3, "幸福是个“元”，永远不会断；烦恼统统完“旦”，罚它靠边站。这个元旦，给你“元”滋“元”味的祝愿：愿你好运“元元”而来，快乐“元元”不断！"));
        mMsgs.add(new Msg(3, 3, "转眼元旦到了，愿好运对你点头哈腰，快乐对你眉开眼笑；美好对你格外宠幸，吉祥对你另眼相待；平安对你趋之若鹜，健康对你关爱有加；幸福对你情有独钟，朋友则祝你元旦快乐，福寿安康！"));
        mMsgs.add(new Msg(4, 3, "滚。。。滚。。。滚。。。元旦快到了，我要把幸福快乐做成圆圈，让它滚向你，越滚越大……嘿嘿，有我这个朋友知足吧，也祝咱们在新的一年里友谊长存!"));
        mMsgs.add(new Msg(5, 3, "元旦快要到了，趁着还没有放假，欢庆晚会还没有开始，祝福短信还没有爆发，你的手机还有空间，我的手机还没欠费，发消息还没涨价，提前祝你元旦快乐！"));

        mMsgs.add(new Msg(1, 4, "手指一按，按去我的美好祝愿。手指一按，按出平安伴你到永远。手指一按，按去幸福生活很美满。手指一按，按去财富围你转。手指一按，短信发到你面前。祝新年快乐！"));
        mMsgs.add(new Msg(2, 4, "新年到了，愿你抱着平安，拥着健康，揣着幸福，携着快乐，搂着温馨，带着甜蜜，牵着财运，拽着吉祥，迈入新年，快乐度过每一天!"));
        mMsgs.add(new Msg(3, 4, "相逢是首悠扬的歌，相识是杯醇香的酒，相处是那南飞的雁，相知是根古老的藤，心静时会默默地祝福您，愿幸福与平安伴随着您一生。新年好心情！"));
        mMsgs.add(new Msg(4, 4, "新年到，齐欢笑，我的短信问你好；贴春联，蒸年糕，幸福生活好运罩；请门神，放鞭炮，福禄双全收红包；穿新衣，满街跑，祝羊年更美好！"));
        mMsgs.add(new Msg(5, 4, "炮竹迎春晓，祥瑞东屋绕；春联透墨香，福字临门倒；红灯光彩照，轻歌更曼妙；喜气挂眉梢，老少乐陶陶；举杯同欢庆，幸福无限好。恭祝新年，大吉大利！"));

        mMsgs.add(new Msg(1, 8, "别动，抢劫！这是抢劫！懂吗?快拿出你的忧愁，交出你的伤心，掏出你的烦恼，摘下你的哀伤，喏！换上这个，我送来的快乐！预祝六一儿童节快乐哦"));
        mMsgs.add(new Msg(2, 8, "童心是帆，祝福是船；快乐的风，吹着童心的帆，载着对你这长不大的朋友的祝福，漂向美丽的海湾，轻轻地问候你：六一节快乐！^0^"));
        mMsgs.add(new Msg(3, 8, "少一些烦恼，不论钞票多少，只要开心就好，累了就睡觉，醒了就微笑，童心到老，祝六一儿童节快乐！^_^"));
        mMsgs.add(new Msg(4, 8, "无知，并不可怕，可怕，则是无耻；贫穷，并不可怜，可怜，则是懒惰；幼稚，并不可笑，可笑，则是无知。六一儿童节，祝你开心快乐。"));
        mMsgs.add(new Msg(5, 8, "激情让岁月颓废，活力将年龄摧毁，童心让纯真永存，乐观让人生无悔，祝你儿童节快乐，天天快乐，永远都快乐！"));
        mMsgs.add(new Msg(6, 8, "有颗童心，一路欢欣；带着童真，美好共枕；满怀童趣，无限乐趣；与童年做伴，与快乐同行，祝你永远年轻，天天好心情！六一了，祝你儿童节快乐哈！"));
        mMsgs.add(new Msg(7, 8, "儿童节快乐！愿你永远拥有一颗童心，天天笑哈哈. 歌舞欢腾，六一儿童庆佳节，阳光灿烂，万千新花正宜人"));
    }

    public static FestivalLab getInstance() {
        if (mInstance == null) {
            synchronized (FestivalLab.class) {
                if (mInstance == null)
                    mInstance = new FestivalLab();
            }
        }

        return mInstance;
    }

    public List<Festival> getFestivals() {
        return new ArrayList<Festival>(mFestivals);//返回一个副本，防止对原始的mFestivals造成修改，从而导致对FestivalLab的影响
    }

    public Festival getFestivalById(int id) {
        for (Festival festival : mFestivals) {
            if (festival.getId() == id) {
                return festival;
            }
        }
        return null;
    }

    public Msg getMsgByFestivalIdAndMsgId(int festivalId, int msgId) {
        List<Msg> msgs = getMsgsByFestivalId(festivalId);
        for (Msg msg : msgs) {
            if (msg.getId() == msgId)
                return msg;
        }

        return null;
    }

    public List<Msg> getMsgsByFestivalId(int fesId) {
        List<Msg> msgs = new ArrayList<Msg>();
        for (Msg msg : mMsgs) {
            if (msg.getFestivalId() == fesId)
                msgs.add(msg);
        }

        return msgs;
    }
}
