import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
     public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Java é uma linguagem de programação");
        curso1.setCargaHoraria(100);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição do cursoc de JavaScript");
        curso2.setCargaHoraria(120);

         Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria de Java");
            mentoria.setDescricao("Descrição mentoria de Java");
            mentoria.setData(LocalDate.now());

         System.out.println(curso1);
         System.out.println(curso2);
         System.out.println(mentoria);
    }
}
