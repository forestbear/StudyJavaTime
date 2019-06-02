package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * z字符串比较
 */

public class SortCollection3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add( "张三123" );
        list.add( "李四去问问额" );
        list.add( "tom" );
        list.add( "王旭2e" );
        list.add( "李强2" );
        list.add( "王凯枪" );


        System.out.println( list );

        Comparator com = new Mycomparator();

        Collections.sort(list,com);

        System.out.println( list );




    }



}

class Mycomparator implements Comparator<String>{

    public int compare( String o1,String o2 ){
        return  o1.length()-o2.length();
    }
}
