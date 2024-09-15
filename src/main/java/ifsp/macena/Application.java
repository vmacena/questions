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
        scanner.nextLine(); // Consumir a nova linha
        boolean isInFibonacci = Fibonacci.isInFibonacciSequence(number);
        System.out.println("O número " + number + (isInFibonacci ? " pertence " : " não pertence ") + "à sequência de Fibonacci.");

        System.out.print("Informe uma string para contar a letra 'a': ");
        String input = scanner.nextLine();
        int count = LetterCount.countLetterA(input);
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");

        int soma = SomaCalculation.calculateSoma();
        System.out.println("O valor de SOMA ao final do processamento é: " + soma);

        scanner.close();
    }
}