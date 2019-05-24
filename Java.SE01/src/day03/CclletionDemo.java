package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * Collection 集合
 * @author codingbear
 *
 */

public class CclletionDemo {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        Cell cell1 = new Cell(1,2);
        Cell cell2 = new Cell(3,4);

        c.add(cell1);
        c.add(cell2);

        System.out.println(c);
        cell1.x=2;

        System.out.println(c);


    }
}
