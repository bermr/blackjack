package blackjack;

public enum Valor {
    DOIS(2, "2"), TRES(3, "3"), QUATRO(4, "4"), CINCO(5, "5"), SEIS(6, "6"),
    SETE(7, "7"), OITO(8, "8"), NOVE(9, "9"), DEZ(10, "10"), VALETE(10, "j"),
    RAINHA(10, "q"), REI(10, "k"), AS(1, "a");

    private final int valor;

    private final String nome;

    private Valor(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    int getValor() {
        return this.valor;
    }
}
