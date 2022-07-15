package ModuloDois.Collections.StreamAPI;

import  java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class MainExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        //IMPRIMIR ELEMENTOS DA STREAM - FORMA 1
        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //IMPRIMIR ELEMENTOS DA STREAM - FORMA 2
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        //IMPRIMIR ELEMENTOS DA STREAM - FORMA 3 COM LAMBDA
        numerosAleatorios.forEach(s -> System.out.println(s));

        //IMPRIMIR ELEMENTOS DA STREAM - FORMA 4 COM REFERENCE METHOD
        numerosAleatorios.forEach(System.out::println);


        //PEGAR OS 5 PRIMEIROS ELEMENTOS E COLOCAR DENTRO DE UM SET
        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        //SE EU QUISESSE PEGAR ESSES 5 PRIMEIROS ELEMENTOS E COLOCAR NUMA VARIVAVEL SERIA DA SEGUINTE FORMA
        /*Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());*/


        //TRANFORMAR A LISTA DE STRING EM NUMEROS INTEIROS - FORMA 1
/*        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/

        //TRANFORMAR A LISTA DE STRING EM NUMEROS INTEIROS - FORMA 2 COM LAMBDA
/*        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream().map(s -> Integer.parseInt(s));*/

        //TRANFORMAR A LISTA DE STRING EM NUMEROS INTEIROS - FORMA 3 COM REFERENCE METHOD
/*        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);*/


        //PEGAR NUMEROS PARES E MAIORES QUE 2 E COLOCAR EM UMA LISTA - FORMA 1
/*        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0 && integer > 2) return true;
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);*/

        //PEGAR NUMEROS PARES E MAIORES QUE 2 E COLOCAR EM UMA LISTA - FORMA 2 COM LAMBDA
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> ListParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(integer -> (integer % 2 == 0 && integer > 2)).collect(Collectors.toList());
        System.out.println(ListParesMaioresQue2);


        //MOSTRAR MEDIA DOS NUMEROS - FORMA 1
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String s) {
                return Integer.parseInt(s);
            }
        });

        //MOSTRAR MEDIA DOS NUMEROS - FORMA 2
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(s -> Integer.parseInt(s));

        //MOSTRAR MEDIA DOS NUMEROS - FORMA 3
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println(value);
            }
        });

        //MOSTRAR MEDIA DOS NUMEROS - FORMA 4
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(value -> System.out.println(value));

        //MOSTRAR MEDIA DOS NUMEROS - FORMA 5
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);


        //REMOVER VALORES IMPARES - FORMA 1
/*        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0) return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);*/

        //REMOVER VALORES IMPARES - FORMA 2
        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(integer -> (integer % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

        //EXERCICIOS
/*      System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        System.out.println("Retirando os números repetidos da lista, quantos números ficam? " + countNumerosUnicos);
        System.out.print("Mostre o menor valor da lista: ");
        System.out.print("Mostre o maior valor da lista: ");
        System.out.println("Pegue apenas os números ímpares e some: " + somaDosNumerosPares);
        System.out.println("Mostre a lista na ordem númerica: ");
        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");*/
    }
}
