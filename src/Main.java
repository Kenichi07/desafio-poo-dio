import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        //System.out.println(curso1);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Vinicius");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Vinicius: " + dev.getConteudosInscristos());

        dev.progredir();
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Vinicius: " + dev.getConteudosInscristos());
        System.out.println("Conteúdos concluídos Vinicius: " + dev.getConteudosConcluidos());
        System.out.println("XP: " + dev.calcularTotaLXp());

        System.out.println("-----------------");

        Dev dev1 = new Dev();
        dev1.setNome("João");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + dev1.getConteudosInscristos());

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos João: " + dev1.getConteudosInscristos());
        System.out.println("Conteúdos concluídos João: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotaLXp());


    }
}