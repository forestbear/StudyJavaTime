package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器
 * @author codingbear
 */
public class TerratorDemo {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");

           Iterator it = c.iterator();

        while ( it.hasNext() ){

            Object obj = it.next();

            String str = (String)obj;

        }

    }
}
