import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Code Girls");
        bootcamp.setDescricao("Descrição Santander Code Girls");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devNilcilaine = new Dev();
        devNilcilaine.setNome("Nilcilaine");
        devNilcilaine.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Nilcilaine:" + devNilcilaine.getConteudosInscritos());
        devNilcilaine.progredir();
        devNilcilaine.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Nilcilaine:" + devNilcilaine.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Nilcilaine:" + devNilcilaine.getConteudosConcluidos());
        System.out.println("XP:" + devNilcilaine.calcularTotalXp());

        System.out.println("-------");

        Dev devTonim = new Dev();
        devTonim.setNome("Tonim");
        devTonim.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tonim:" + devTonim.getConteudosInscritos());
        devTonim.progredir();
        devTonim.progredir();
        devTonim.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tonim:" + devTonim.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tonim:" + devTonim.getConteudosConcluidos());
        System.out.println("XP:" + devTonim.calcularTotalXp());

    }

}