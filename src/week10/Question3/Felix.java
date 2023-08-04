package week10.Question3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
    Map - Sort the map by values
Write a method that can sort the Map by values.
     */
public class Felix {

    public static Map<String,Integer> sortMapByValues(Map<String,Integer> map){

        Map<Integer,String> invertedMap = new TreeMap<>();//swap keys and values, use treeMap sort by value

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            invertedMap.put(each.getValue(), each.getKey());
        }

        map.clear();

        for (Map.Entry<Integer, String> each : invertedMap.entrySet()) {//swap sorted keys and values back
            map.put(each.getValue(), each.getKey());
        }

        return map;

    }

    public static void main(String[] args) {
        Map<String,Integer> test = new LinkedHashMap<>();
        test.put("X",5);
        test.put("E",2);
        test.put("I",4);
        test.put("L",3);
        test.put("!",6);
        test.put("F",1);

        System.out.println(test);

        System.out.println(sortMapByValues(test));

        System.out.println(sortMapByValues(test).keySet());

        System.out.println(sortMapByValues(test).values());

    }

}
