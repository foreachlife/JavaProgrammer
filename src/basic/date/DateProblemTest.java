package basic.date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

/**
 * @author yy
 * @data 2022/8/13 21:42
 */
public class DateProblemTest {
    private static DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:ss:mm", Locale.CHINA);

    /**
     * Calendar 与 Date 类都是非常古老的 设计的很不合理  进行计算时不建议使用
     */
    public static void main(String[] args) {
        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDate.of(2022, 12, 15).atTime(22, 12, 23);
        getRandomDateByTwoDateRegion(startDate, endDate);

    }

    /**
     * 获取两个日期间的随机日
     *
     * @return
     */
    private static void getRandomDateByTwoDateRegion(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long diff = Math.abs(duration.toDays());
        Random rd = new Random();
        Integer plusDate = rd.nextInt((int) diff);
        LocalDateTime dateTime = start.plusDays(Integer.toUnsignedLong(plusDate));
        String strDate = dateTime.format(DATE_TIME_FORMAT);
        System.out.println(dateTime);
        System.out.println(strDate);

    }


}
