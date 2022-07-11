package ModuloDois.VariaveisDadosOperadores.Variaveis;

public class MainVariaveis {
    public static void main(String[] args) {

        int i; //correta

        /*int i;
        comentada pois não pode haver variaveis com mesmo nome*/

        int I;
        //correta

        /*int 1a;
        não se pode iniciar com números*/

        int _1a;
        int $aq;
        //as duas acima devem ser evitadas ao máximo

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;
        //variaveis devidamente iniciadas com um valor

        final int j = 10;
        //sempre teremos o valor 10 nessa variavel final

        /*j = 15;
        retornará um erro pois não podemos redeclarar variaveis*/

        int asrn24678md;
        //correta

        /*int asrn246 78md;
        não se pode ter espaços na declaração*/

        int asrn2$4678_md = 10;
        //é valido porem não é recomendado

        /*int asrn2$46%78_md = 10;
        caracter especial invalido*/

        asrn24678md = 100;
        asrn2$4678_md = 10;
        //variaveis devidamente iniciadas com um valor

        int quantidadeProduto = 50;
        //correta

        /*int QuantidadeProduto;
        nao se inicia com letra minuscula*/

        final int NUMERO_TENTATIVAS = 5;
        //variaveis final devem ser declaradas em uuper case e separadas por "_"

        /*final int numeroTentativas = 5;
        definido de forma incorreta por mais que funcione*/

        int QUANTIDADE_OPCOES = 25;
        //definido de forma incorreta, pois não é FINAL por mais que funcione

        /*int qtdProd;
        não segue boas práticas pois não está bem definida*/

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
