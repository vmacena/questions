package ifsp.macena.exercises;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static boolean isInFibonacciSequence(int number) {
        List<Integer> fibonacciSequence = generateFibonacciSequence(number);
        return fibonacciSequence.contains(number);
    }

    private static List<Integer> generateFibonacciSequence(int max) {
        List<Integer> sequence = new ArrayList<>();
        int a = 0, b = 1;
        sequence.add(a);
        sequence.add(b);
        while (b <= max) {
            int next = a + b;
            a = b;
            b = next;
            sequence.add(b);
        }
        return sequence;
    }
}