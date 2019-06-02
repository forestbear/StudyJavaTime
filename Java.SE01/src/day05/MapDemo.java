package day05;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Map
 * 数据结构看起来就像 多行两列  Map( key,value );
 * 其中key 不能重复，重复的是指 equals 为 true;
 * @author codingbear
 */

public class MapDemo {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("高数",90);
        map.put("语文",100);
        map.put("地理",88);
        map.put("化学",73);
        map.put("物理",100);
        map.put("英语",110);

        System.out.println(map);

        int num = map.get("高数");

        System.out.println("高数:"+ num );

        int num2 = map.remove("英语");

        System.out.println(num2);

        System.out.println(map);


        if (map.containsKey("英语")){

            System.out.println("包含英语");
        }else{
            System.out.println("不包含英语");
        }



    }
}
