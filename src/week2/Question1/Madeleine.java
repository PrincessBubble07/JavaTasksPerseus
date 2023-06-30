package week2.Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Madeleine {

    public static void swap(int a, int b) {
        List<Integer> tempList = new ArrayList<>();
        tempList.add(a);
        tempList.add(b);

        Collections.swap(tempList, 0, 1);

        a = tempList.get(0);
        b = tempList.get(1);
    }

    public static void main(String[] args) {

        int a = 22;
        int b = 23;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a,b);

        System.out.println("-------------------------------------");

        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }










}
/*
    Swap Numbers

    Swap two variable's values without using a third variable
     */