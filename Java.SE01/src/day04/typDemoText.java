package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型
 * @author codingbear
 */
public class typDemoText {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<String>();

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        for (String str:c){
            System.out.println(str);
        }

        Iterator<String> it = c.iterator();

        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }





    }
}
