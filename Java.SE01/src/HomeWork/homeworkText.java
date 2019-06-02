package HomeWork;

import day03.Cell;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *   计算促销日期
 *   @author codingbear
 */

public class homeworkText {
    public static void main(String[] args) throws ParseException {

        /**
         * 1，创建Scanner
         * 2，接收生产时期
         * 3，接收保质期
         * 4，将字符串转换为Date
         * 5，将Date转换为Calendar
         * 6，加上保质期天数
         * 7，减去14天
         * 8，设置为当周的周三
         * 9.将Calendar转换为Date
         * 10.将Date转换为字符串
         * 11，输出
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println( "请输入生产日期" );


        String DateStr = scanner.nextLine(); //获取生产日期
        System.out.println("请输入保质期");

        int days = Integer.parseInt( scanner.nextLine() );  // 保质期天数

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date = sdf.parse( DateStr );


        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        calendar.add( calendar.DAY_OF_YEAR,days );
        calendar.add( calendar.DAY_OF_YEAR,-14 );
        calendar.add( calendar.DAY_OF_WEEK,4 );

        date = calendar.getTime();

        DateStr = sdf.format(date);

        System.out.println(DateStr);

    }
}
