package org.jeffpine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Conteúdos
        Curso cursoJava = new Curso("Java Fundamentos", "Sintaxe, OOP, Collections", 12);
        Curso cursoSpring = new Curso("Spring Boot", "REST API, JPA, Tests", 10);
        Mentoria mentoriaCarreira = new Mentoria("Carreira Dev",
                "Roadmap, portfólio e entrevistas", LocalDate.now());

        // Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java do zero ao deploy");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSpring);
        bootcamp.getConteudos().add(mentoriaCarreira);

        // Devs
        Dev jeff = new Dev("Jeferson Pinheiro");
        Dev ana = new Dev("Ana Souza");

        jeff.inscreverNoBootcamp(bootcamp);
        ana.inscreverNoBootcamp(bootcamp);

        // Progresso
        jeff.progredir(); // conclui 1
        jeff.progredir(); // conclui 2

        ana.progredir();  // conclui 1

        // Relatórios
        System.out.println("=== Bootcamp ===");
        System.out.println(bootcamp);

        System.out.println("\n=== Devs ===");
        System.out.println(jeff);
        System.out.println("Inscritos Jeff: " + jeff.getConteudosInscritos());
        System.out.println("Concluídos Jeff: " + jeff.getConteudosConcluidos());

        System.out.println();
        System.out.println(ana);
        System.out.println("Inscritos Ana: " + ana.getConteudosInscritos());
        System.out.println("Concluídos Ana: " + ana.getConteudosConcluidos());

        // XP total
        System.out.printf("%nXP Jeff: %.1f%n", jeff.calcularTotalXp());
        System.out.printf("XP Ana: %.1f%n", ana.calcularTotalXp());
    }
}
