public static void divideWithoutOperator(int num1, int num2){
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" remainder: "+num1);
    }
