package week7.Question2;

public class Elizabeth {
    // /*
    //    Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    //arr = Sort(arr); ==>{ 7, 8, 9, 10};
    //     */


        public static void main(String[] args)
        {
            int[] arr = new int[] { 10, 9, 8, 7};
            //Example Array To sort
            for (int i = 0; i < arr.length; i++)
            {      //Loop over java Array outer loop
                for (int j = i + 1; j < arr.length; j++)
                {  // Loop over java array inner loop
                    int temp = 0;   //temporary variable in order to compare.
                    if (arr[i] > arr[j])
                    {          //compare outer loop object with inner loop
                        temp  = arr[i];    // if greater than swapping.
                        arr[i] = arr[j];    // Swapping code here.
                        arr[j] = temp;
                    }
                }
            }
            // After Sorting Printing The Value

            for (int i = 0; i < arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        }
    }






