package Models;

public class Musica {
    private String nome;
    private String cantor;
    private Double duracao;

    public Musica(String nome, String cantor, Double duracao) {
        this.nome = nome;
        this.cantor = cantor;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getCantor() {
        return cantor;
    }

    public Double getDuracao() {
        return duracao;
    }
}
