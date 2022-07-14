package ModuloDois.Collections.Sets;

import java.util.*;

public class MainExemploSet {
    public static void main(String[] args) {

        //CRIAR UM HASHSET
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //os elementos repetidos não são exibidos
        System.out.println(notas.toString());

        //EXIBIR POSIÇÃO DO VALOR PASSADO
        //System.out.println("Exiba a posição da nota 5.0: "); não conseguimos fazer isso com o set pois não temos o metodo get

        //ADICIONAR O VALOR PASSADO NA POSIÇÃO INDICADA
        //System.out.println("Adicione na lista a nota 8.0 na posição 4: "); não conseguimos fazer isso pois no set não ha como trabalhar com ordem

        //SUBSTITUIR UM VALOR POR OUTRO
        //System.out.println("Substitua a nota 5.0 pela nota 6.0: "); também não conseguimos fazer isso no set

        //VERIFICAÇÃO SE O VALOR PASSADO ESTÁ NO HASHSET
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d)); //retorna true se tiver no conjunto

        //EXIBIR A 3 NOTA ADICIONADA
        //System.out.println("Exiba a terceira nota adicionada: "); não consigo fazer pois não tenho o get

        //EXIBIR MENOR E MAIOR NOTA
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //EXIBIR A SOMA DOS VALORES QUE ESTÃO NO CONJUNTO
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //EXIBIR A MÉDIA DOS VALORES QUE ESTÃO NO CONJUNTO
        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        //REMOVER O VALOR PASSADO DO CONJUNTO
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //REMOVER VALOR DE UMA POSIÇÃO
        //System.out.println("Remova a nota da posição 0"); não temos como pq não da pra saber a posição 0

        //REMOVER VALOR MENOR DO QUE UM PARAMETRO PASSADO
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //EXIBIR VALORES NA ORDEM INFORMADA
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //EXIBIR VALORES NA ORDEM CRESCENTE
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //APAGAR O CONJUNTO INTEIRO
        System.out.println("Apague todo o conjunto");
        notas.clear();

        //CONFRINDO SE O CONJUNTO ESTÁ VAZIO
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }
}
