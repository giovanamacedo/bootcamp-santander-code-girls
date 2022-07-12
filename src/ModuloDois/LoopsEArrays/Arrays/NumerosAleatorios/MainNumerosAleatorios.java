package ModuloDois.LoopsEArrays.Arrays.NumerosAleatorios;

import java.util.Random;

public class MainNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int [] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length ; i++){
            int numerosRandom = random.nextInt(100);
            numerosAleatorios[i] = numerosRandom;
        }

        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessor de números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1) + " ");
        }

        System.out.print("\nSucessor de números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }

    }
}
