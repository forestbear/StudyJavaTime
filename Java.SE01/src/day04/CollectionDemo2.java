package day04;

import day03.Cell;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 删除元素
 * @author codingbear
 */

public class CollectionDemo2 {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        c.add(new Cell(1,2));
        c.add(new Cell(2,3));
        c.add(new Cell(3,4));


        System.out.println(c);

        Cell cell= new Cell(1,2);

        c.remove(cell);
        System.out.println(c);

    }
}
