import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria(){};
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrção mentoria java");
        mentoria.setDate(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçaõ Bootcamp Java Developer");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev devFabricio = new Dev();
        devFabricio.setNome("Fabricio");
        devFabricio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Fabricio: " + devFabricio.getConteudosInscritos());

        devFabricio.progredir();
        devFabricio.progredir();
        devFabricio.progredir();

        System.out.println(".");
        System.out.println("Conteudos inscritos de Fabricio: " + devFabricio.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Fabricio: " + devFabricio.getConteudosConcluidos());
        System.out.println("XP:" + devFabricio.calcularTotalXp());

        System.out.println("....................");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Camila: " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();

        System.out.println(".");
        System.out.println("Conteudos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }
}
