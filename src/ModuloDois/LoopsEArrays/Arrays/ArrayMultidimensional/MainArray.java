package ModuloDois.LoopsEArrays.Arrays.ArrayMultidimensional;

import java.util.Random;

public class MainArray {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] matriz = new int [4][4]; //4 linhas e 4 colunas respectivamente

        int menor = Integer.MIN_VALUE; //variável que guarda o menor valor
        int linha = 0, coluna = 0; //posição inicial da linha e da coluna

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(9);

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j]; //o valor da variável menor passa a ser o valor aleatório
                    linha = i; //que está na linha representada pela variável i
                    coluna = j; //que esta na coluna representada pela variável j
                }

            }
        }

        System.out.println("Menor: " + menor); //menor valor
        System.out.println("Linha: " + linha); //linha que se encontra o menor valor
        System.out.println("Coluna: " + coluna); //coluna que se encontra o menor valo

        System.out.println("\nMatriz"); //Mensagem ilustrativa
        for (int[] linhaMatriz : matriz ) {
            for (int colunaMatriz : linhaMatriz){
                System.out.print(colunaMatriz + " ");
            }
            System.out.println();

        }
    }
}
