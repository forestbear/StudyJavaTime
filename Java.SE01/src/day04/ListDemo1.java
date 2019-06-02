package day04;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

/**
 * List集合   通常是有序集
 * 特点是可以根据下标操作元素
 * @author codingbear
 */
public class ListDemo1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("java");
        list.add("php");
        list.add("javaScript");
        list.add("C#");

        String str = list.get( 2 );

        System.out.println(str);

        list.set( 2,"dddd" );

        System.out.println(list);





    }
}










