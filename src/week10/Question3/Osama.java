package week10.Question3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Osama {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<>(Map.of("b", 33, "a", 4, "n", 90, "z", 0,
                "p", 3, "l", 1, "e", 2, "i", -23));
        System.out.println(sortValue(map));

    }
    public static Map<String,Integer> sortValue(Map<String,Integer> map){
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        for(int i = 0; i < entries.size(); i++){
            for(int j = 0; j < entries.size() -1; j++){
                if(entries.get(j).getValue() > entries.get(j + 1).getValue()){
                    Map.Entry<String, Integer> temp = entries.get(j);
                    entries.set(j, entries.get(j+1));
                    entries.set(j+1, temp);
                }
            }
        }

        Map<String, Integer> sorted = new LinkedHashMap<>();
        for(Map.Entry<String, Integer> each : entries){
            sorted.put(each.getKey(), each.getValue());
        }

        return sorted;
    }

}

