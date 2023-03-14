package Sistemas;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, a = 0, b = 1, c = 0;
        boolean belongsToFibonacci = false;

        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();

        if (num == a || num == b) {
            belongsToFibonacci = true;
        } else {
            while (c < num) {
                c = a + b;
                a = b;
                b = c;
                if (num == c) {
                    belongsToFibonacci = true;
                    break;
                }
            }
        }

        if (belongsToFibonacci) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}