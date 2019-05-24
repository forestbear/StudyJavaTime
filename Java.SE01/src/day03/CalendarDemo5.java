package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * void add();
 * 给时间分量节点增加时间;
 * @author codingbear
 *
 */

public class CalendarDemo5 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        calendar.add(calendar.YEAR,3);
        System.out.println( calendar.getTime() );

        calendar.add(calendar.DAY_OF_WEEK,2);
        System.out.println( calendar.getTime() );




    }
}
