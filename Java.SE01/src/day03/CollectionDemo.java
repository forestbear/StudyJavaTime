package day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 *
 * 集合里面的其他元素
 * @author codingbear
 *
 */

public class CollectionDemo {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add(1);

        Date date = new Date();

        c.add(date  );

           int num = c.size();

        System.out.println( "集合的数量"+ num);



         boolean b =  c.isEmpty();

        System.out.println( b );


        c.clear();

        System.out.println(c);





    }

}
