package week10.Question3;

/*
   Map - Sort the map by values
Write a method that can sort the Map by values.
    */

import java.util.*;

public class Liuda {


    public static void main(String[] args) {

        //Creating a map (fruit name -> key, price -> value)
        Map<String, Integer> hashmap = new HashMap<>();

        //Inserting elements
        hashmap.put("Avocado", 80);
        hashmap.put("Honeydew", 60);
        hashmap.put("Blueberries", 45);
        hashmap.put("Cranberries", 60);
        hashmap.put("Mango", 75);

        sortedMap(hashmap);



    }
    public static void sortedMap(Map<String, Integer> hashmap) {

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());

        list.sort(Map.Entry.comparingByValue());

        list.forEach((key) -> System.out.println(key.getKey() + " :  " + key.getValue()));




    }


    public static void sortedMap1(Map<String, Integer> hashmap) {

    //Creating a map (fruit name -> key, price -> value)
    Map<String, Integer> hashmap1 = new HashMap<>();

    //Inserting elements
        hashmap1.put("Avocado", 80);
        hashmap1.put("Honeydew", 60);
        hashmap1.put("Blueberries", 45);
        hashmap1.put("Cranberries", 60);
        hashmap1.put("Mango", 75);
    //Using forEach loop to print the elements
    //Before sorting
        System.out.println("The original array before sorting:");
        hashmap.forEach((key, value) -> System.out.println(key + " :  " + value));

    //After sorting
        System.out.println("\nAfter sorting by their prices:");

    //Creating a list of the original hashmap in order to sort
    //the elements with sort() method
    List<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());

    //Using Entry's comparingByValue() method for sorting in ascending order
        list.sort(Map.Entry.comparingByValue());

    //Printing the elements from the list
        list.forEach((fruit) -> System.out.println(fruit.getKey() + " :  " + fruit.getValue()));
}
}