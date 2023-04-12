import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java", "Descrição curso Java", 8);

        Curso curso2 = new Curso("Javascript", "Descrição curso Javascript", 20);

        Mentoria mentoria = new Mentoria("Masterclass", "Descrição Masterclass", LocalDate.now().plusDays(10));

        System.out.println(mentoria.getData());
    }
}
