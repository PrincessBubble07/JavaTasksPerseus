package week8.Question1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class adrian {
    public static void main(String[] args) {
        int N = 4;
        int[] result = generateZeroSumArray(N);
        System.out.println(Arrays.toString(result));
    }

    public static int[] generateZeroSumArray(int N) {
        int[] arr = new int[N];
        Random random = new Random();

        // Generate N-1 unique random integers
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < N - 1; i++) {
            int num;
            do {
                num = random.nextInt(200) - 100; // Generate random integers between -100 to 99
            } while (uniqueNumbers.contains(num));
            arr[i] = num;
            uniqueNumbers.add(num);
        }

        // Calculate the last element to make the sum zero
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        arr[N - 1] = -sum;

        return arr;
    }
}




