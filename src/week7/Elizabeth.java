package week7;
import java.util.Arrays;
import java.util.Collections;
public class Elizabeth {


    //   /*
    //    Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    //arr = Sort(arr); ==> {90, 20, 10, 8, 7};
    //     */


        public static void main(String[] args)
        {
            int temp;
             //initializing an array
            int a[]={10, 20 , 7, 8, 90};
            for (int i = 0; i < a.length; i++)
            {
                for (int j = i + 1; j < a.length; j++)
                {
                    if (a[i] < a[j])
                    {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println("Array elements in descending order:");
 //accessing elements in the array
            for (int i = 0; i <=a.length - 1; i++)
            {
                System.out.println(a[i]); //print out
            }
        }
    }





