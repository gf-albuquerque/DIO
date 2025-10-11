import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Descrição curso Java", 8);

        Curso curso2 = new Curso("Javascript", "Descrição curso Javascript", 20);

        Mentoria mentoria = new Mentoria("Masterclass", "Descrição Masterclass", LocalDate.now().plusDays(10));

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Paulo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Dev Paulo: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Dev Paulo: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Dev Paulo: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Dev Joao: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Dev Joao: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Dev Joao: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
