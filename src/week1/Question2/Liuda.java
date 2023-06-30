package week1.Question2;

public class Liuda {
    public static int divideWithoutOperator(int dividend, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Determine the sign of the result
        int sign = 1;
        if (dividend*divisor<0) {
            sign = -1;
        }

        // Convert the numbers to positive to simplify the calculation
        int absDividend = Math.abs(dividend);
        int absDivisor = Math.abs(divisor);

        // Perform the division
        int quotient = 0;
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            quotient++;
        }

        // Apply the sign to the result
        quotient *= sign;

        return quotient;
    }
}
