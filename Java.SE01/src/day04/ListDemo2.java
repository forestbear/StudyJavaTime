package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * List 集合
 * subList 截取
 * @author codingbear
 */

public class ListDemo2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i=0;i<10;i++){
            list.add(i);
        }

        System.out.println(list);

        List<Integer> subList = list.subList(3,8);

        System.out.println( subList );


        /**
         *   将子集中的元素扩大10倍
         */

        for (int i=0;i<subList.size();i++){

            subList.set(i,subList.get(i)*10);

        }

        System.out.println( subList );

        System.out.println(list);


    }
}
