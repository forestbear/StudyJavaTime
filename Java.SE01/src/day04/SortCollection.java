package day04;

import java.util.*;

/**
 *
 * 集合排序
 * @author codingbear
 *
 */
public class SortCollection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        Random random = new Random();

        for (int i=0;i<10;i++){

            list.add( random.nextInt(100) );

        }

        System.out.println( list );

        Collections.sort(list);

        System.out.println( list );


    }

}
