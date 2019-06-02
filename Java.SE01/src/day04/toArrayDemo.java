package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * toArray 集合转为数组
 * Collection中定义了两个方法
 * Object[] toArray();
 * <T>T[] toArray(T[] array)
 * @author codingbear
 */

public class toArrayDemo {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();

        c.add("one");
        c.add("two");
        c.add("three");


        /**
         * 传入的数组长度有区别
         * 若数给的长度小于数组原本的大小数组自己创建，若给定的大于数组的长度大小按给定的建立长度
         */

        String[] arr = c.toArray( new String[ 10 ]  );

        for ( String str : arr ){

            System.out.println( str );

        }

    }
}
