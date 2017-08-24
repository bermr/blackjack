package blackjack;
    

public class Jogador implements Player{
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
    
    public Jogador(String nome, Hand mao) {
        this.nome = nome;
        this.mao = mao;
        this.pont = 0;
        this.joga = 1;
    }

    public int getPont() {
        return pont;
    }

    @Override
    public void setPont(int pont) {
        this.pont = pont;
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

    public void setMao(Hand mao) {
        this.mao = mao;
    }
    

    public void printMao(){
         System.out.print("MAO: " + getMao().getCarta(0).getValor() + " DE "+ getMao().getCarta(0).getNipe());
         System.out.println(" / " + getMao().getCarta(1).getValor() +" DE "+ getMao().getCarta(1).getNipe());
    }
    
}
