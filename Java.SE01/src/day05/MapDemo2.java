package day05;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * hashcode 对Map的影响
 *
 * @author codingbear
 *
 */
public class MapDemo2 {
    public static void main(String[] args) {

        /**
         *
         * 使用HashMap 时应当注意：
         *
         * 作为key的对象有以下要求：
         *
         * 1：首先当key这个类重写了equals方法，那么重写的hashCode的要求必须满足
         * 2：作为key的对象存入HashMap后，其会影响hashcode值的内容不要发生改变，否则可能会影响map的操作
         *
         */

        Map<Point, Integer> map = new HashMap<Point, Integer>();

        Point p = new Point(1,2);

        map.put( p ,100);

        boolean contains = map.containsKey( p );

        System.out.println( contains );

        System.out.println( p.hashCode()); // hashcode值

        p.setX(2);


        System.out.println(p.hashCode());// 改变之后的hashCode值 --->  内容一样位置不一样


        System.out.println(map);

        Integer i = map.get(p);

        System.out.println( i ); //返回的是null


        map.put( p,200 );

        System.out.println(map);

        map.remove(p);

        System.out.println(map);

        p.setX(1);

        map.remove(p);

        System.out.println(map);





    }
}
