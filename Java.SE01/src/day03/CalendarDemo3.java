package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 使用Calendar 设置时间
 *
 * @author codingbear
 *
 */

public class CalendarDemo3 {
    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        /*
         *  希望表示1991-01-08  11:11:11
         */
        calendar.set( calendar.YEAR,1991 );
        calendar.set( calendar.MONTH,0 );
        calendar.set( calendar.DAY_OF_MONTH,8 );
        calendar.set( calendar.HOUR_OF_DAY,11 );
        calendar.set( calendar.MINUTE,11 );
        calendar.set( calendar.SECOND,11 );

        Date date = calendar.getTime();

        System.out.println( date );


/*-----------------------------自己附加练习 ↓  ---------------------------------------------------------------------*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

        String str = sdf.format(date);

        System.out.println(str);


        long days = date.getTime();


        System.out.println(days);

    }
}
