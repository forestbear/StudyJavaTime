package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * 集合的批量处理方法
 * @author codingbear
 *
 */

public class CollecitonDemo1 {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add("java");
        c.add("php");
        c.add("C#");
        c.add("C++");

        System.out.println( c );

        Collection c1 = new ArrayList();

        c1.add( "ios" );
        c1.add( "android" );



        c.addAll(c1);

        System.out.println(c );

        Collection c3 = new ArrayList();
        c3.add("java");

//      c3.add("vb");
        boolean containsAll = c.containsAll(c3);

        System.out.println(containsAll);





    }
}
