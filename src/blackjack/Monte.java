package blackjack;

import java.util.Collections;
import java.util.Stack;


public class Monte{

    private Stack<Carta> monte;

    
    public Monte(){ 
        this.monte = new Stack<>();
    }
    
    
    public void setMonte(Stack<Carta> m){
        this.monte = m;
    }
    
    public Stack<Carta> getMonte(){
        return monte;
    }
    
    public Carta getCarta(int i){
        return monte.get(i);
    }
    
    public Carta retiraCarta(){
        if (!monte.empty())
            return monte.pop();
        else return null;
    }
    
    static void embaralha(Stack<Carta> monte){
        Collections.shuffle(monte);
    }

    public Stack<Carta> montaDeck(){
        Stack<Carta> pilha = new Stack<Carta>();

        for (Nipe n : Nipe.values()) { 
            for (Valor v : Valor.values()) {
                Carta c = new Carta();
                c.setNipe(n);
                c.setValor(v);  
                pilha.add(c);
            }   
        }    
        embaralha(pilha);
    return pilha;
}
}
