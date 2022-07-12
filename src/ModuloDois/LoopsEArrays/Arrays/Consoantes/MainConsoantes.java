package ModuloDois.LoopsEArrays.Arrays.Consoantes;

import java.util.Scanner;

public class MainConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scanner.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                qtdConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String consoante : consoantes ) {
            if (consoante != null) System.out.println(consoante + " ");
        }
    }
}
