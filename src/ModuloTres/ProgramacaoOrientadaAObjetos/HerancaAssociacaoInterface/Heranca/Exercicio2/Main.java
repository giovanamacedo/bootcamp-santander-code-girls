package ModuloTres.ProgramacaoOrientadaAObjetos.HerancaAssociacaoInterface.Heranca.Exercicio2;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();

        //UPCASTS PQ SÃO SUBTIPOS DE FUNCIONARIO
        //SAO IMPLICITOS
        Funcionario gerente1 = new Gerente();
        Funcionario vendedor1 = new Vendedor();
        Funcionario faxineiro1 = new Faxineiro();

        //DOWNCASTS
        //AQUI VAI DAR ERRO PQ VENDEDOR É UMA SUBCLASSE
        //AS INFOS QUE POSSUEM EM VENDEDOR NAO NECESSARIAMENTE POSSUEM EM FUNCIONARIO
        Vendedor vendedor2 = (Vendedor) new Funcionario();

    }
}
