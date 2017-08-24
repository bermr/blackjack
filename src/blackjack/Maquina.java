package blackjack;

import java.util.Scanner;


public class Maquina implements Player{
    private String nome;
    private Hand mao;
    private int pont;
    private int joga;

    public int getJoga() {
        return joga;
    }

    public void setJoga(int joga) {
        this.joga = joga;
    }
    
    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }
    
    public Maquina(String nome, Hand mao) {
        this.nome = nome;
        this.mao = mao;
        this.pont = 0;
        this.joga = 1;
    }
    
    @Override
    public int somaMao(){
        int soma = 0;
        for (int j=0 ; j< getMao().cartas.size() ; j++)
            soma =  soma + getMao().getCarta(j).getValor().getValor();
        return soma;
    }
    
    @Override
       public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public Hand getMao() {
        return mao;
    }

    @Override
    public void setMao(Hand mao) {
        this.mao = mao;
    }
    
    @Override
    public void printMao(){
        System.out.print("MAO: " + getMao().getCarta(0).getValor() + " DE "+ getMao().getCarta(0).getNipe());
        System.out.println(" / " + getMao().getCarta(1).getValor() +" DE "+ getMao().getCarta(1).getNipe());
    }
    
      
    public int jogar(Monte deck, Maquina player, int soma, int hit, int nivel){    
        Scanner read = new Scanner(System.in);

        if (nivel == 0){
            deck.getMonte().peek().setLado(1);
            System.out.println(deck.getMonte().peek().getValor() + " DE " + deck.getMonte().peek().getNipe());
        }
        System.out.println("1: HIT 2: QUEIMAR 3: PARAR ");
        if(player.somaMao() > 18)
            hit = 3;
        else hit = 1;
        switch (hit) {
            case 2:
                Carta c = deck.getMonte().pop();
                System.out.println("CARTA QUEIMADA: " + c.getValor() + " DE " + c.getNipe());
                break;
            case 3:
                soma = player.somaMao();
                return soma;
            case 1:
                player.getMao().addCarta(deck.getMonte().pop());
                soma = player.somaMao();
                System.out.println("CARTA: " + player.getMao().cartas.get(player.getMao().cartas.size()-1).getValor() + " DE " + player.getMao().cartas.get(player.getMao().cartas.size()-1).getNipe());
                break;
            default:
                break;
        }
        if (soma == 21){
            System.out.println("BLACKJACK!!! ");
            return soma;
        }
        else if (soma > 21){
            System.out.println("ESTOUROU :( ");
            return soma;
        }
        return 1;
    }

}
