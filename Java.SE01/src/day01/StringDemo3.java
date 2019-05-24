package day01;

/**
 *
 * 去除字符串两边的空白
 * String strim()
 * @author codingbear
 *
 */

public class StringDemo3 {
    public static void main(String[] args){

        String str = "    hello world  ";

        String trim = str.trim();

        System.out.println( str );

        System.out.println( trim );

    }
}
