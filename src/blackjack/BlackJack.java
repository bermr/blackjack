package blackjack;

public class BlackJack {

    static void novoJogo() {
        BlackJackUI bj = new BlackJackUI();
        bj.setVisible(true);
    }

    private Monte monte;
    private Player player1, player2;
    private Maquina machine;
    private int modo;
    private int level;
    private int op;
    private int first;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getModo() {
        return modo;
    }

    public void setModo(int modo) {
        this.modo = modo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BlackJack(Monte monte, Player player1, Player player2) {
        this.monte = monte;
        this.player1 = player1;
        this.player2 = player2;
    }

    public BlackJack(Monte monte, Player player1) {
        this.monte = monte;
        this.player1 = player1;
    }

    public BlackJack(Monte monte, Player player1, Maquina machine) {
        this.monte = monte;
        this.player1 = player1;
        this.machine = machine;
    }

    public Monte getMonte() {
        return monte;
    }

    public void criaMao(Player player) {
        Hand mao = new Hand();
        mao.addCarta(monte.getMonte().pop());
        mao.addCarta(monte.getMonte().pop());
        player.setMao(mao);
    }

    public static void main(String[] args) {       
        novoJogo();
    }

}
