package ModuloDois.VariaveisDadosOperadores.TiposDeDados;

public class MainTipos {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        //correto

        short s1 = 20000;
        //correto

        /*short s2 = 40000;
        o valor está acima do limite*/


        /*int i1 = -10000000000;
        está menor do que o tamanho negativo que o int pode suportar*/

        int i2 = 28500;
        //correto

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;
        //correto e como é long deve-se usar a letra "l" no final para diferenciar de int

        /*float f1 = 4.5;
        deve-se colocar no final do float a letra "f"*/

        float f2 = 10.68F;
        //correto

        double d1 = 85.69;
        double d2 = 99.04D;
        //correto

        char c1 = 'W';
        //correto

        /*char c2 = 'Tw';
        deve-se ter apenas um caracter no char*/

        char c3 = '\u0057';
        //correto pois é um codigo unicode e equivale a uma letra

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";
        //correto

        /*String dt1 = "09/02/1981";
        incorreto pois como o valor se refere a uma data temos um tipo de dado adequado para isso*/

        boolean bo1 = true;
        boolean bo2 = false;
        //correto

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
