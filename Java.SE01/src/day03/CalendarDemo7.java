package day03;

import java.util.Calendar;

/**
 * 获取某个时间分量所允许的最大值
 * @author codingbear
 */
public class CalendarDemo7 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int days = calendar.getActualMaximum(calendar.DAY_OF_WEEK);

        System.out.println(days);
    }
}
