package ModuloTres.DesafioIntermediarioSantander;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        int desconto = input.nextInt();
        int precoAntigo = input.nextInt();


        int precoNovo = precoAntigo - (precoAntigo * desconto / 100);
        System.out.println(precoNovo);
    }
}
