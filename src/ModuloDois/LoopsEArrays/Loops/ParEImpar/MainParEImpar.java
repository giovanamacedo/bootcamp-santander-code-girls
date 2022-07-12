package ModuloDois.LoopsEArrays.Loops.ParEImpar;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class MainParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Qual a quantidade de números?");
        int qtdNumeros = scanner.nextInt();

        do {
            System.out.println("Digite o número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0){
                numerosPares++;
            } else {
                numerosImpares++;
            }

            count++;

        } while (count < qtdNumeros);

        System.out.println("Quantidade de números pares: " + numerosPares);
        System.out.println("Quantidade de números ímpares: " + numerosImpares);
    }
}
