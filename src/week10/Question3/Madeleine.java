package week10.Question3;

import java.util.*;

public class Madeleine {

    //OPTION 1

    public static Map<String, Integer > sortMap(Map<String, Integer> map) { //  takes a map as an input, returns a map with keys as a string and values as an integer
        /* this method sorts values in ascending order and returns a new Map containing the sorted entries. It does this by iteratively finding the entry with the smallest value in the input map and adding it to the sorted map*/

        Map<String, Integer> sorted = new LinkedHashMap<>(); // created linkedHashMap to store the sorted entries

        for (String s : map.keySet()) { // iterates through the keys of the input map

            Integer minValue = Integer.MAX_VALUE; //creates a constant for the max value
            String key = "";

            for (Map.Entry<String, Integer> each : map.entrySet()) { // iterates through all entries in the input map, keeping track of the smallest Integer value (minValue) and its corresponding key to find the entry with the minimum value in the map
                if (each.getValue() < minValue) {
                    minValue=each.getValue();
                    key=each.getKey();
                }
            }

            sorted.put(key, minValue); // pair with the smallest value found in the previous loop is added to the sorted map
            map.put(key, Integer.MAX_VALUE); //corresponding entry in the input map is temporarily updated to have the maximum possible value (Integer.MAX_VALUE) to avoid picking the same minimum value again in the next iteration.

        }
        return sorted;
    }


    //OPTION 2

    public static Map<String, Integer> sortMap2(Map<String, Integer> map) {

        Map<String, Integer> sorted = new LinkedHashMap<>();

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue) // comparator to compare entries based on the int values
        );

        pq.addAll(map.entrySet()); //add the values from the map to the priority queue which organizes based on values

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll(); //finds and removes smallest value from pq
            sorted.put(entry.getKey(), entry.getValue());
        }

        return sorted;
    }


    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("fox", 25);
        map.put("dolphin", 14);
        map.put("eagle", 25);
        map.put("zebra", 0);
        map.put("cobra", 7);
        map.put("frog", 2);
        map.put("deer", 25);

        System.out.println();


        System.out.println("Original: " + map);

        System.out.println();

        System.out.println("Sorted by values: " +sortMap(map));

        System.out.println();
        System.out.println("-----------------option 2-----------------");
        System.out.println();

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("red", 100);
        map2.put("purple", 175);
        map2.put("blue", 125);
        map2.put("yellow", 190);
        map2.put("pink", 175);
        map2.put("green", 152);
        map2.put("orange", 188);


        System.out.println("Original: " + map2);

        System.out.println();

        System.out.println("Sorted by values: " +sortMap2(map2));


    }







}
