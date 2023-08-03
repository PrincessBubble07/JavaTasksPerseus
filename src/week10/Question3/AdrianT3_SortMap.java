package week10.Question3;

import java.util.*;

public class AdrianT3_SortMap {

    public static void main(String[] args) {
        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("Alice", 30);
        unsortedMap.put("Bob", 20);
        unsortedMap.put("Charlie", 40);
        unsortedMap.put("David", 10);

        Map<String, Integer> sortedMap = sortByValue(unsortedMap);

        // Print the sorted Map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the entryList using custom comparator for values in ascending order
        Collections.sort(entryList, Map.Entry.comparingByValue());

        // Create a new LinkedHashMap to preserve the order of sorted elements
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}




