package ModuloTres.ProgramacaoOrientadaAObjetos.EstruturasBasicas;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);

        carro1.setCor("Vermelho");
        carro1.setModelo("Fiat Idea");
        carro1.setCapacidadeTanque(59);

        System.out.println("Carro 1");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        System.out.println("\nCarro 2");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));
    }
}
