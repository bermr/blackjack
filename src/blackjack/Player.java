package blackjack;


public interface Player {    
    public int somaMao();
     
    public String getNome();

    public void setNome(String nome);
 
    public Hand getMao();

    public void setPont(int pont);
    
    public int getPont();
    
    public void setMao(Hand mao);

    public void printMao();
}
