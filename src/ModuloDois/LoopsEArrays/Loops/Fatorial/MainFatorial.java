package ModuloDois.LoopsEArrays.Loops.Fatorial;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
*/

import java.util.Scanner;

public class MainFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        int multiplicacao = 1;

        System.out.println(numero + "! = ");
        for (int i = numero; i >= 1; i--) {
            multiplicacao *= i;

            if (i != 1) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + "=" + (multiplicacao));
            }
        }

    }
}
