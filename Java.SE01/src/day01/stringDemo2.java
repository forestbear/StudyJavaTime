package day01;

/**
 * String subString (int start,int end)
 * 截取字符串部分内容
 * @author codingbear
 */


public class stringDemo2 {
    public static void main(String[] args){

                    //012345678901234567890
        String str = "https://www.baidu.com";


        /**
         * 使用数字比表示范围   java包含头部不包含尾部
         */
        String sub = str.substring( 12,17 ); // 截取为 -> "baidu"

        System.out.println(sub);

        String sub1 = str.substring(12);  //截取内容为 -> "baidu.com"

        System.out.println( sub1 );


        /**
         * 小例子
         *
         * 思路:
         * 获取第一个点的位置 在它后面+1 就是后面一个点的位置！
         */

        int start = str.indexOf(".");
        int end = str.indexOf( ".",start +1 );

        sub = str.substring( start+1,end );

        System.out.println(sub);







    }
}
