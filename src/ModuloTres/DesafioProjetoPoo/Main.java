package ModuloTres.DesafioProjetoPoo;

import ModuloTres.DesafioProjetoPoo.Dominio.Conteudo;
import ModuloTres.DesafioProjetoPoo.Dominio.Curso;
import ModuloTres.DesafioProjetoPoo.Dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

        Conteudo conteudo1 = new Curso();
        Conteudo conteudo2 = new Mentoria();

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
