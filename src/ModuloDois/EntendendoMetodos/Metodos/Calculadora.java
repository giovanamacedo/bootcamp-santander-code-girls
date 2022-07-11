package ModuloDois.EntendendoMetodos.Metodos;

public class Calculadora {
    public static void soma (double numero1, double numero2){
        double resultadoSoma = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " é igual a: " + resultadoSoma);
    }

    public static void subtracao (double numero1, double numero2){
        double resultadoSubtracao = numero1 - numero2;
        System.out.println("A subtração de " + numero1 + " - " + numero2 + " é igual a: " + resultadoSubtracao);
    }

    public static void multiplicacao (double numero1, double numero2){
        double resultadoMultiplicacao = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + " X " + numero2 + " é igual a: " + resultadoMultiplicacao);
    }

    public static void divisao (double numero1, double numero2){
        double resultadoDivisao = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + " / " + numero2 + " é igual a: " + resultadoDivisao);
    }
}
