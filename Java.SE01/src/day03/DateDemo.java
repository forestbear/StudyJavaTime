package day03;

import java.util.Date;

/**
 *
 * Date
 *
 */
public class DateDemo {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println( date );

        long time = date.getTime();

        System.out.println( time );


        date.setTime(0);
        System.out.println( date );

        date.setTime( time+24*60*60*1000 );
        System.out.println( date );


    }



}
