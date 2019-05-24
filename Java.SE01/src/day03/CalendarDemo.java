package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 日历
 *用于操作时间
 * @author codingbear
 *
 */
public class CalendarDemo {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println( calendar );


        Date date = calendar.getTime();


        System.out.println(date);
    }
}