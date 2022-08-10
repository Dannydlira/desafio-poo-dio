import br.com.dio.desafio.dominio.*;
import com.sun.source.tree.ConditionalExpressionTree;

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

         Conteudo conteudo1 = new Curso();

         Mentoria mentoria = new Mentoria();
         mentoria.setTitulo("Mentoria de Java");
         mentoria.setDescricao("Descrição mentoria de Java");
         mentoria.setData(LocalDate.now());

//         System.out.println(curso1);
//         System.out.println(curso2);
//         System.out.println(mentoria);

         Bootcamp bootcamp = new Bootcamp();
         bootcamp.setNome("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição do Bootcamp de Java");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

         Dev devDaniela = new Dev();
         devDaniela.setNome("Daniela");
         devDaniela.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos Inscritos Daniela" + devDaniela.getConteudosInscritos());
         devDaniela.progredir();
         devDaniela.progredir();
         devDaniela.progredir();
         System.out.println("-");
         System.out.println("Conteúdos Inscritos Daniela" + devDaniela.getConteudosConcluidos());
         System.out.println("Conteúdos Concluídos Daniela" + devDaniela.getConteudosConcluidos());
         System.out.println("Xp:"  + devDaniela.calcularTotalXp());

         System.out.println("--------");

         Dev devHeloisa = new Dev();
         devHeloisa.setNome("Heloisa");
         devHeloisa.inscreverBootcamp(bootcamp);
         System.out.println("Conteúdos Inscritos Heloisa" + devHeloisa.getConteudosInscritos());
         devHeloisa.progredir();
         devHeloisa.progredir();
         System.out.println("-");
         System.out.println("Conteúdos Inscritos Heloisa" + devHeloisa.getConteudosInscritos());
         System.out.println("Conteúdos Concluídos Heloisa" + devHeloisa.getConteudosConcluidos());
         System.out.println("Xp:"  + devHeloisa.calcularTotalXp());
    }
}
