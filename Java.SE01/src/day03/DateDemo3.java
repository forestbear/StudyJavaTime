package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 小例子
 *算一下从出生到现在您存活了多少分钟了！
 */

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {

        Date date = new Date();

        System.out.println( "请输入你到生日时期(格式为 yyyy-MM-dd)" );

        Scanner scanner = new Scanner(System.in);

        String BriDate = scanner.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date Brilong = sdf.parse(BriDate);

        long Botlong = Brilong.getTime();
        long now = date.getTime();

        long tims = now - Botlong;

        long days = tims/(24*60*60*1000);

        long Oneh = 36500-days;

        System.out.println("你已经从出生到现在度过了" + days+"天,距离你100周年诞辰还有:"+ Oneh +"天");











    }
}
