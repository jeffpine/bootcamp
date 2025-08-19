
# 🚀 Desafio: Aprendendo na Prática Programação Orientada a Objetos em Java

Este projeto foi desenvolvido como parte do desafio **Aprendendo na Prática POO** da [Digital Innovation One](https://www.dio.me/).  
O objetivo é colocar em prática os **4 pilares da Orientação a Objetos (POO)**: **Abstração, Encapsulamento, Herança e Polimorfismo**.

---

## 📌 Sobre o Projeto
O sistema simula um **Bootcamp de Programação**, contendo **cursos**, **mentorias** e **desenvolvedores inscritos**.  
Cada dev pode se inscrever, progredir nos conteúdos e acumular **XP** (pontos de experiência).

### 🔹 Entidades Modeladas
- **Conteudo (abstrata)** → Superclasse para cursos e mentorias.  
- **Curso** → Define título, descrição e carga horária.  
- **Mentoria** → Define título, descrição e data.  
- **Bootcamp** → Contém lista de conteúdos e devs inscritos.  
- **Dev** → Representa o aluno, com métodos para inscrição, progresso e cálculo de XP.  

---

## 🧱 Pilares da POO aplicados
- **Abstração** → `Conteudo` é abstrata, garantindo que cada tipo de conteúdo implemente `calcularXp()`.  
- **Encapsulamento** → Atributos privados com getters e setters.  
- **Herança** → `Curso` e `Mentoria` **estendem** `Conteudo`.  
- **Polimorfismo** → `calcularXp()` é sobrescrito de forma diferente em `Curso` e `Mentoria`.  

---

## 🛠 Tecnologias Utilizadas
- ☕ **Java 17**  
- 🖥 **IntelliJ IDEA** (ou qualquer IDE Java)  
- 📦 **Collections (Set, HashSet, LinkedHashSet)**  

---

## ▶️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/bootcamp-poo-java.git
   ```
2. Abra o projeto em sua IDE preferida.  
3. Compile e execute a classe `Main.java`.

---

## 📚 Exemplo de Execução

### Entrada simulada no `Main`:
```java
Curso cursoJava = new Curso("Java Fundamentos", "Sintaxe, OOP, Collections", 12);
Curso cursoSpring = new Curso("Spring Boot", "REST API, JPA, Tests", 10);
Mentoria mentoriaCarreira = new Mentoria("Carreira Dev", "Roadmap e portfólio", LocalDate.now());

Bootcamp bootcamp = new Bootcamp();
bootcamp.setNome("Bootcamp Java Developer");
bootcamp.getConteudos().add(cursoJava);
bootcamp.getConteudos().add(cursoSpring);
bootcamp.getConteudos().add(mentoriaCarreira);

Dev jeff = new Dev("Jeferson Pinheiro");
jeff.inscreverNoBootcamp(bootcamp);
jeff.progredir();
jeff.progredir();

System.out.println("XP Jeff: " + jeff.calcularTotalXp());
```

### Saída esperada:
```
=== Bootcamp ===
Bootcamp{nome='Bootcamp Java Developer', descricao='Aprenda Java do zero ao deploy', inicio=2025-08-18, fim=2025-10-02, conteudos=3, devs=2}

=== Devs ===
Dev{nome='Jeferson Pinheiro', inscritos=1, concluidos=2, xp=220.0}
Inscritos Jeff: [Mentoria{Título='Carreira Dev', Descrição='Roadmap e portfólio', Data=2025-08-18}]
Concluídos Jeff: [Curso{Título='Java Fundamentos', Descrição='Sintaxe, OOP, Collections', CargaHoraria=12h}, Curso{Título='Spring Boot', Descrição='REST API, JPA, Tests', CargaHoraria=10h}]

XP Jeff: 220.0
```

---

## 📖 Conceitos Reforçados
- Classes, atributos e métodos.  
- Classes abstratas e polimorfismo.  
- Relacionamento entre objetos (composição).  
- Coleções (`Set`, `HashSet`, `LinkedHashSet`).  
- Encapsulamento e boas práticas com getters e setters.  

---

## 👨‍💻 Autor
Desenvolvido por **Jeferson Pinheiro de Jesus**  
🔗 [LinkedIn](https://www.linkedin.com/in/eijeffpinheiro/)
