package blackjack;


public class Carta{
    private Valor valor;
    private Nipe nipe;
    private int lado; //0 pra baixo 1 pra cima

    Carta() {
        this.valor = null;
        this.nipe = null;
        this.lado = 0;
    }
    
    
    public Valor getValor() {
        return valor;
    }

    public void setValor(Valor valor) {
        this.valor = valor;
    }

    public Nipe getNipe() {
        return nipe;
    }

    public void setNipe(Nipe nipe) {
        this.nipe = nipe;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Carta(Valor valor, Nipe nipe, int lado) {
        this.valor = valor;
        this.nipe = nipe;
        this.lado = lado;
    }
    
}
