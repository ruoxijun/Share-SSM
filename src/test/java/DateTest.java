import org.junit.Test;
import ruoxijun.util.MyDateFormat;

import java.util.Date;

/**
 * Date: 2020/11/29
 * Time: 15:07
 * Description: No Description
 */
public class DateTest {

    @Test
    public void dateTest(){
        String time = "1603271034297";
        String date = MyDateFormat.queryDate(Long.parseLong(time));
        System.out.println(date);
    }

}
