package ModuloDois.Collections.Map;

import java.util.*;

public class MainExemploMap {
    public static void main(String[] args) {

        //FORMAS DE CRIAR UM MAP
        //Map carrosPopulares2020 = new HashMap(); //antes do java 5
        //Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        //HashMap<String, Double> carrosPopulares = new HashMap<>();
        //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)

        //CRIAR UM DICIONARIO COM MAP
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4); //aqui não usamos add, usamos o put
            put("uno", 15.6); //nao aceitamos mais de uma chave igual, apenas se ela tiver valore diferente
            put("mobi", 16.1); //ele nao armazena na ordem
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        //SOBRESCREVER O VALOR
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2); //passamos a chave que queremos substituir e seu valor
        System.out.println(carrosPopulares);

        //VERIFICAR EXISTENCIA DE VALOR NO DICIONARIO
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

        //ENCONTRAR O VALOR DE UMA CHAVE
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("Exiba o terceiro modelo adicionado: "); não temos como fazer isso pois não há um metodo para isso

        //EXIBIR AS CHAVES INSERIDAS
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        //EXIBIR OS VALORES DAS CHAVES
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        //EXIBIR QUAL CHAVE TEM MAIOR VALOR
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        //EXIBIR A CHAVE COM MENOR VALOR
        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        //SOMA DOS VALORES DAS CHAVES
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        //MEDIA DA SOMA DOS VALORES DAS CHAVES
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        //REMOVER VALOR ABAIXO DO PARAMETRO PASSADO
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        //EXIBIR AS CHAVES NA ORDEM QUE FORAM ADICIONADAS
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        //EXIBIR OS VALORES ORDENADOS PELO MODELO, OU SEJA, EM ORDEM ALFABETICA
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        //APAGAR O DICIONARIO
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

        //CONFERINDO SE O DICIONARIO ESTA VAZIO
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
    }
}
