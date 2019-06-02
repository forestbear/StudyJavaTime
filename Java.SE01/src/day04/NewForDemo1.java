package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环只能遍历集合或者数组不能代替传统的循环工作
 * @author codingbear
 */
public class NewForDemo1 {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        for (Object o : c){

            String str = (String)o;

            System.out.println(str);//输出 one two.....five;
        }


    }
}
