package day03;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * Date与Calendar的转换
 * @author codingbear
 *
 */
public class CalendarDemo2 {
    public static void main(String[] args) {

        Date date = new Date();

        Calendar calendar = Calendar.getInstance();

        /**
         *
         *Calendar 提供一个方法
         * void setTime();
         * 该方法用于是当前Calendar表示给定的
         * Date所表示的时间
         *
         */

        calendar.setTime(date);


    }
}
