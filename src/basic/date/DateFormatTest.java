package basic.date;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 日期格式化
 *
 * @author yy
 * @data 2022/8/13 21:37
 */
public class DateFormatTest {


    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");

    /**
     * 日期类
     *
     * @param args
     */
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(DATE_FORMAT.format(date));

    }
}
