package Sistemas;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura da string a ser invertida
        System.out.println("Digite uma string:");
        String original = sc.nextLine();
        
        // Variável para armazenar a string invertida
        String invertida = "";
        
        // Inversão dos caracteres
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        
        // Impressão da string invertida
        System.out.println("String invertida: " + invertida);
        
        sc.close();
    }

}