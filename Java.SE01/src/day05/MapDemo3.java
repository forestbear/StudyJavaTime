package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * 遍历map的三种方法；
 * 1：遍历key
 * 2：遍历键值对 key-value
 * 3：遍历value
 *
 * @author codingbear
 *
 */
public class MapDemo3 {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("数学",100);
        map.put("语文",100);
        map.put("化学",100);
        map.put("地理",100);
        map.put("物理",100);
        map.put("体育",100);
        map.put("历史",100);
        map.put("生物",100);
        map.put("政治",100);

        // 01

        Set<String> set = map.keySet();

        for ( String key: set){
            System.out.println( "key:" + key );
        }

        // 02

        Set<Entry<String,Integer>>  entrySet =  map.entrySet();


        for ( Entry<String,Integer> entry:entrySet ){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println( key + "--> "+value );
        }

        // 03
        Collection<Integer> value =  map.values();

        for ( Integer values: value)
        {
            System.out.println(values);
        }

    }
}
