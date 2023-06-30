package week2.Question2;


import java.util.ArrayList;
import java.util.List;

public class Liza {
    public static void main(String[] args) {
        String divisibleBy15 = " ";
        String divisibleBy5 = " ";
        String divisibleBy3 = " ";
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
            list.add(i + 1);

        for (int each : list) {
            if (each % 15 == 0 && each % 3 == 0)
                divisibleBy15 += each + " ";
            if (each % 5 == 0 && each % 15 != 0)
                divisibleBy5 += each + " ";
            if (each % 3 == 0 && each % 15 != 0)
                divisibleBy3 += each + " ";
        }
        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }
}