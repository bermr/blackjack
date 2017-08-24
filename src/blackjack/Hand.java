package blackjack;

import java.util.ArrayList;


class Hand {
    ArrayList<Carta> cartas;

    public Carta getCarta(int i) {
        return cartas.get(i);
    }
    
    Hand() {
        this.cartas = new ArrayList<Carta>();
    }
    
    void addCarta(Carta c){
        cartas.add(c);
    }
}
