package ModuloDois.LoopsEArrays.Arrays.OrdemInversa;

public class MainOrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -6, 15, 50, 8, 4}; //6 elementos e 5 posicoes

        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
