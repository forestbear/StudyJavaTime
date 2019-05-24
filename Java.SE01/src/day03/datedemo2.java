package day03;

import java.net.SocketImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class datedemo2 {


    public static void main(String[] args) throws ParseException {


        String str = "2019-05-22 03:29:00";


        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        Date date = sdf.parse(str);

        System.out.println( date );








    }

}
