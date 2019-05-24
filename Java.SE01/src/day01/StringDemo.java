package day01;
/**
 * index Of
 * 检索字符串位置
 * @author codingbear
 *
 */

public class StringDemo {

    public static void main(String[] args) {

        String str = "Thinking in java";

        int index = str.indexOf( "java" );

        System.out.println( index );

        index = str.indexOf("in",2);

        System.out.println( index );


        index = str.lastIndexOf( "in" );

        System.out.println( index );


    }
}
