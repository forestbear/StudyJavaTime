package day01;
/**
 * 获取给定位置上面的字符
 * char charAt(int index)
 * @author codingbear
 *
 */
public class StringDemo4 {
    public static void main(String[] args) {

        String str = " What is java ? ";

        char w = str.charAt(2);

        System.out.println(w);

        /**
         *
         * 检查回文
         *
         * 上海自来水来海上


         */

        str = "上海自来水来自海上";

        for (int i=0;i<str.length()/2;i++){

                if ( str.charAt(i) != str.length()-1-i ){
                    System.out.println("不是回文" );
                    return;
                }
        }

        System.out.println( "是回文" );




    }
}
