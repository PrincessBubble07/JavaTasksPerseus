package week10.Question1;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Madeleine {

    //OPTION 1
    public static ArrayList<Integer> sortArrayListAsc(ArrayList<Integer> list) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(list);
        ArrayList<Integer> sortedList = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            sortedList.add(minHeap.poll());
        }

        return sortedList;
    }


    //OPTION 2
    public static void sortArrayListAscending(ArrayList<Integer> list) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (Integer num : list) {
            if (treeMap.containsKey(num)) {
                int uniqueKey = generateUniqueKey(treeMap, num);
                treeMap.put(uniqueKey, num);
            } else {
                treeMap.put(num, num);
            }
        }

        list.clear();
        list.addAll(treeMap.values());
    }

    public static int generateUniqueKey(TreeMap<Integer, Integer> treeMap, int num) {
        int uniqueKey = num;
        while (treeMap.containsKey(uniqueKey)) {
            uniqueKey++;
        }
        return uniqueKey;
    }



    public static void main(String[] args) {

        System.out.println("----------OPTION 1----------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(5);

        System.out.println("Original list: " + numbers);

        ArrayList<Integer> sortedNumbers = sortArrayListAsc(numbers);

        System.out.println("In ascending order: " + sortedNumbers);


        System.out.println();
        System.out.println();


        System.out.println("----------OPTION 2----------");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(-61);
        numbers2.add(4);
        numbers2.add(2);
        numbers2.add(100);
        numbers2.add(4);

        System.out.println("Original list: " + numbers2);

        sortArrayListAscending(numbers2);

        System.out.println("In ascending order: " + numbers2);






    }




}
