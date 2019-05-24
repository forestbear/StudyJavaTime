package day03;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * simpleDateFormat
 * 根据特殊的日期格式在字符串和Date之间 相互转换
 * @author condingbear
 */


public class DateDemo1 {
    public static void main(String[] args) {

        Date date = new Date();

        String dateformat = "yyyy//MM//dd E HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(dateformat);

        String str = sdf.format( date );

        System.out.println(str);




    }
}
