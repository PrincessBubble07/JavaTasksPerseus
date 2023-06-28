package week6.Question3;

public class adrian_SumOfDigits {
    public static int calculateSumOfDigits(String input) {
        int sum = 0;

        // Iterate over each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Convert the digit character to an integer and add it to the sum
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "abc123def456";
        int digitSum = calculateSumOfDigits(str);
        System.out.println("Sum of digits: " + digitSum);
    }
}

