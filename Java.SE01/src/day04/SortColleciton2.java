package day04;

import day03.Cell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable 接口
 * 使用Collection的sort方法进行排序的集合，要求元素必须实现Comparable接口只有实现了该接口才认为是可比较的元素
 *
 * @author codingbear
 *
 *
 */
public class SortColleciton2 {

    public static void main(String[] args) {

        List<Cell> list = new ArrayList<Cell>();

        list.add( new Cell(4,5) );
        list.add( new Cell(2,3) );
        list.add( new Cell(1,2) );
        list.add( new Cell(3,4) );


        Collections.sort(list);

        System.out.println(list);

    }

}
