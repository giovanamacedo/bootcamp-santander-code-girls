package ModuloTres.DesafioProjetoPoo;

import ModuloTres.DesafioProjetoPoo.Dominio.*;

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

/*      System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Giovana");
        dev1.inscreverBootcamp(bootcamp1);
        dev1.progredir();
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXP());

        Dev dev2 = new Dev();
        dev2.setNome("Mateus");
        dev2.inscreverBootcamp(bootcamp1);
        dev2.progredir();
        System.out.println("Conteúdos inscritos" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos" + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularXP());

    }
}
