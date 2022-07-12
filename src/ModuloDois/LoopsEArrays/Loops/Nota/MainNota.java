package ModuloDois.LoopsEArrays.Loops.Nota;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class MainNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Abertura da entrada de fluxo de dados através do teclado

        System.out.println("Digite a nota: ");
        double nota = scanner.nextDouble(); //Entrada de dados, neste caso de um double

        while (nota < 0 || nota > 10){ //Enquanto o valor da nota for menor que 0 ou maior que 10.
                System.out.println("Nota inválida!");
                System.out.println("Digite a nota novamente: ");
                nota = scanner.nextDouble(); //entrada de valor novamente
        }
        System.out.println("Nota: " + nota);
    }
}
