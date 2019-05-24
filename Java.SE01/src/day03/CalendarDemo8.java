package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 *输入一个日期，输出三年，三个月，三天后的当周的周三的日期；
 * @author codingbear
 */

public class CalendarDemo8 {
    public static void main(String[] args) throws ParseException {

        System.out.println( "请输入一个日期 (格式 yyyy-MM-dd) " );
        Scanner scanner = new Scanner(System.in);

        String strDate = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date inputDate = sdf.parse(strDate);

        System.out.println( inputDate );



        Calendar calendar = Calendar.getInstance();

        calendar.setTime(inputDate);

        calendar.add(calendar.YEAR,3);
        calendar.add(calendar.MONTH,3);
        calendar.add(calendar.DAY_OF_YEAR,3);
        calendar.set(calendar.DAY_OF_WEEK,4);


        inputDate = calendar.getTime();

        strDate = sdf.format(inputDate);

        System.out.println( strDate );



    }
}
