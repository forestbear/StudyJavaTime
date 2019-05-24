package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 三个月后的第十天的周三是几号;
 * @author codingbear ;
 */

public class CalendarDemo6 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.add(calendar.MONTH,3);
        calendar.add(calendar.DAY_OF_YEAR,10);
        calendar.set(calendar.DAY_OF_WEEK,4);

        System.out.println( calendar.getTime() );


    }
}
