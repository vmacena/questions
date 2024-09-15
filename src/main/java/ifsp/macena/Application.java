package ifsp.macena;

import ifsp.macena.exercises.Fibonacci;
import ifsp.macena.exercises.LetterCount;
import ifsp.macena.exercises.SomaCalculation;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        boolean isInFibonacci = Fibonacci.isInFibonacciSequence(number);
        System.out.println("O número " + number + (isInFibonacci ? " pertence " : " não pertence ") + "à sequência de Fibonacci.");

        System.out.print("Informe uma string para contar a letra 'a': ");
        String input = scanner.nextLine();
        int count = LetterCount.countLetterA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");

        int soma = SomaCalculation.calculateSoma();
        System.out.println("O valor de SOMA ao final do processamento é: " + soma);

        System.out.println("Sequências:");
        System.out.println("a) 1, 3, 5, 7, " + nextInSequenceA());
        System.out.println("b) 2, 4, 8, 16, 32, 64, " + nextInSequenceB());
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, " + nextInSequenceC());
        System.out.println("d) 4, 16, 36, 64, " + nextInSequenceD());
        System.out.println("e) 1, 1, 2, 3, 5, 8, " + nextInSequenceE());
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, " + nextInSequenceF());

        System.out.println("\nInterruptores e Lâmpadas:");
        System.out.println("1. Ligar o primeiro interruptor e esperar alguns minutos.");
        System.out.println("2. Desligar o primeiro interruptor e ligar o segundo interruptor.");
        System.out.println("3. Ir até a sala das lâmpadas.");
        System.out.println("4. A lâmpada que está acesa é controlada pelo segundo interruptor.");
        System.out.println("5. A lâmpada que está quente mas apagada é controlada pelo primeiro interruptor.");
        System.out.println("6. A lâmpada que está fria e apagada é controlada pelo terceiro interruptor.");

        scanner.close();
    }

    private static int nextInSequenceA() {
        return 9;
    }

    private static int nextInSequenceB() {
        return 128;
    }

    private static int nextInSequenceC() {
        return 49;
    }

    private static int nextInSequenceD() {
        return 100;
    }

    private static int nextInSequenceE() {
        return 13;
    }

    private static int nextInSequenceF() {
        return 200;
    }
}