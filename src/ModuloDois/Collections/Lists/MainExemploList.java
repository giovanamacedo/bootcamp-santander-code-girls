package ModuloDois.Collections.Lists;

import java.util.*;

public class MainExemploList {
    public static void main(String[] args) {

//      List notas = new ArrayList(); //antes do java 5

//      ArrayList<Double> notas = new ArrayList<>();

//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //dessa forma eu não posso adicionar nem remover
        notas.add(10d);
        System.out.println(notas);*/

        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); //aqui tornamos essa lista imutavel, ou seja, tbm não posso adicionar nem remover
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString()); //aqui podemos colocar no sout só a variavel ou com o toString

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //o indexOf mostra a posicao da nota passada

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); //aqui é adicionado na posição 4 a nota 8
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); //com o indexOf passamos a posição e depois passamos o valor que queremos substituir
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); //aqui é retornado um boolean

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota); //conseguimos fazer isso com o foreach

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        //usamos a classe collections já que não temos o metodo nativo no arraylist
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //o metodo iterator é utilizado para iterar a lista, assim conseguimos pegar os valores e somar
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d); //tenho que colocar o 0D pois sem o D ele vai remover o valor da posição 0 e não o valor 0
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0");
        notas.remove(0); //sem o d no final ele remove o valor da posição 0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //*System.out.println("Apague toda a lista");
/*        notas.clear();
        System.out.println(notas);
        //*
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());*/

        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List <Double> notas2 = new LinkedList<>(notas);
        System.out.println(notas2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
        notas2.remove(notas2.get(0));
        System.out.println(notas2);
    }
}
