package blackjack;

public enum Nipe {

    COPAS("c"), OUROS("o"), PAUS("p"), ESPADAS("e");

    private final String nome;

    private Nipe(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
