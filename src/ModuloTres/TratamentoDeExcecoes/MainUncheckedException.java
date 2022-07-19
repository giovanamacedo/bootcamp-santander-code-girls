package ModuloTres.TratamentoDeExcecoes;

import javax.swing.*;

public class MainUncheckedException {
    public static void main(String[] args) {

        boolean continueLooping = true;

        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida, tente um número inteiro. Erro: " + e.getMessage());
                //e.printStackTrace();

            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
            }

            finally {
                System.out.println("Chegou no finally");
            }

        } while (continueLooping);

        System.out.println("Chegou aqui");

    }

    public static int dividir (int a, int b) {
        return a/b;
    }
}
