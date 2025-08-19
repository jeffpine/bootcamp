package org.jeffpine;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev() {}
    public Dev(String nome) { this.nome = nome; }

    public void inscreverNoBootcamp(Bootcamp bootcamp) {
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println(nome + " não está matriculado em nenhum conteúdo.");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Set<Conteudo> getConteudosInscritos() { return conteudosInscritos; }
    public Set<Conteudo> getConteudosConcluidos() { return conteudosConcluidos; }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", inscritos=" + conteudosInscritos.size() +
                ", concluidos=" + conteudosConcluidos.size() +
                ", xp=" + calcularTotalXp() +
                '}';
    }
}
