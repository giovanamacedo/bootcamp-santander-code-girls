package ModuloDois.LoopsEArrays.Loops.MaiorEMedia;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class MainMaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Digite o número: ");
            int numero = scanner.nextInt();
            count++;

            if (numero > maior) maior = numero;

            soma += numero;

        } while (count < 5);

        System.out.println("Recebemos 5 números!");
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números recebidos: " + (soma/5));
    }
}
