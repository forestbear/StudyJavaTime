package day04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列 java.util.Queue;
 * 保存一组数据，存取元素必须遵循先进先出原则
 * FIFO （first Input first Output）
 *
 */
public class QueueDemo {
    public static void main(String[] args) {

        Queue<String>  queue = new LinkedList<String>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        System.out.println(queue);

        /**
         * T poll() 用于获取队列第一个元素 也仅仅只能拿到开头的第一个; 获取后队列里面将不存在该元素
         */
        String str = queue.poll();

        System.out.println(str);  // 输出 A
        System.out.println(queue);  // 输出 B，C，D

        /**
         * T peek
         * 用于获取首元素，仅引用不做出队操作
         */
        String str2 = queue.peek();

        System.out.println(str2);
        System.out.println(queue);


        /**
         * 遍历队列是一次性的
         */

        while ( queue.size()>0 ){
            String str3 = queue.poll();

            System.out.println(str3);
            System.out.println(queue);

        }







    }
}
