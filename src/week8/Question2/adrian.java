package week8.Question2;

public class adrian {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }


        while (count < n) {
            arr[count] = 0;
            count++;
        }
    }
}

