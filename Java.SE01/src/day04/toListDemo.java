package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 数组转为List集合
 * 不能转换为set集合，原因在于set集合不能存放重复元素
 * @author codingbear
 *
 */
public class toListDemo {
    public static void main(String[] args) {
        String[] array = {"1","2","3","4","5","6","7","8"};

        List<String> list = Arrays.asList(array);

        System.out.println(list);

        List<String> list2 = new ArrayList<>(list);
        list2.add("9");
        System.out.println(list2);
    }
}
