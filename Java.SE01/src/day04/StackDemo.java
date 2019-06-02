package day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈
 * 用于储存一组数据，存取元素必须遵循先进后出的原理
 * 通常用于记录一组操作可追寻
 * @author codingbear
 */
public class StackDemo {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<String>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println( stack );

        String string =  stack.pop();

        System.out.println(stack);

        while (stack.size()>0){

            String str = stack.pop();

            System.out.println( str);
        }

        System.out.println( stack);
    }
}