package ruoxijun.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date: 2020/11/29
 * Time: 15:02
 * Description: No Description
 */
public class MyDateFormat {

    /**
     * 传入时间戳格式化时间
     * @param time 时间戳
     * @return
     */
    public static String queryDate(long time) {
        //创建SimpleDateFormat对象，指定样式    2019-05-13 22:39:30
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //要格式化的Date对象
        Date date=new Date(time);
        //使用format()方法格式化Date对象为字符串，返回字符串
        return sdf.format(date);
    }

}
