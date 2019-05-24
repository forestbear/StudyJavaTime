package day03;

import java.util.Calendar;

/**
 *   int get();
 *   获取时间分量某个固定值;
 * @author codingbear
 */

public class CalendarDemo4 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(calendar.YEAR);
        int month = calendar.get(calendar.MONTH)+1;
        int days = calendar.get(calendar.DAY_OF_MONTH);

        int Hour = calendar.get(calendar.HOUR_OF_DAY);
        int Min = calendar.get(calendar.MINUTE);
        int Sec = calendar.get(calendar.SECOND);
        int Week =  calendar.get(calendar.WEEK_OF_MONTH)+1;


        System.out.println( year+"年"+month+"月"+days+"号"+Hour+"时"+Min+"分"+Sec+"秒"+", 周"+Week );

    }
}
