package week6.Question2;

/*2. Find Maximum:
  Write a method that can find the maximum number from an int Array.
  */
public class Liuda {

    public static int maximum_number(int[] numbers){

        int max =numbers[0]; //  assume that first element is maximum number

        for (int i = 1; i <numbers.length ; i++) { // start from second element  index i:1, 2, 3, 4, 5
            if(numbers[i]>max){ // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }
        }

        return max;
    }
    public static void main(String[] args) {

        System.out.println("maximum number: "+maximum_number(new int[]{20,3,6,12,500}));


    }
}
