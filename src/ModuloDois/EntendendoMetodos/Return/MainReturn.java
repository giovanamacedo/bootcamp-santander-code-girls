package ModuloDois.EntendendoMetodos.Return;

public class MainReturn {
    public static void main(String[] args) {
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Retorno.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Retorno.area(5d, 5d);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Retorno.area(7, 8, 9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}