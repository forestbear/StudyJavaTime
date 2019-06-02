package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 迭代器
 * @author codingbear
 */

public class IterratorDemo2 {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add( "#" );
        c.add( "java" );
        c.add( "#" );
        c.add( "ios" );
        c.add( "php" );
        c.add( "#" );
        c.add( "C#" );


        Iterator it = c.iterator();

        while (it.hasNext()){
            String str = (String)it.next();

            if ("#".equals(str)){

                /*
                在使用迭代器的时候 不可以通过集合的相关方法改变集合元素
                 */
                //c.remove(str);
                it.remove();
                //System.out.println(str);
            }
        }

        System.out.println(c);

    }

}
