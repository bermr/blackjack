package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.Timer;

public class BlackJackUI extends javax.swing.JFrame {
    
    public BlackJackUI() {
        initComponents();
        Monte deck = new Monte();
        deck.setMonte(deck.montaDeck());
        Hand mao = new Hand();
        Player jugador = new Jogador("Michael", mao);
        blackj = new BlackJack(deck,player1);
    }
    
    private BlackJack blackj;
    private Jogador player1, player2;
    private Maquina cpu;
    private int turno;
    private int end1, end2;
    private Timer timerBarrinha;
    
    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getEnd2() {
        return end2;
    }

    public void setEnd2(int end2) {
        this.end2 = end2;
    }
    
    public int getEnd1() {
        return end1;
    }

    public void setEnd1(int end1) {
        this.end1 = end1;
    }
    
    public BlackJack getBlackjack() {
        return blackj;
    }

    public void setBlackjack(BlackJack blackjack) {
        this.blackj = blackjack;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        ajuda = new javax.swing.JRadioButton();
        manete = new javax.swing.JLabel();
        gameMode = new javax.swing.JLabel();
        btn1Player = new javax.swing.JButton();
        btnPlayervsCpu = new javax.swing.JButton();
        btn2Players = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        fundo1 = new javax.swing.JLabel();
        pontuacao = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        hit = new javax.swing.JButton();
        burn = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        monte = new javax.swing.JButton();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        carta4 = new javax.swing.JButton();
        cartamesa = new javax.swing.JButton();
        fundo2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        endGame = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBarrinha = new javax.swing.JProgressBar();
        pontp1 = new javax.swing.JButton();
        pontp2 = new javax.swing.JButton();
        winner = new javax.swing.JLabel();
        youwin = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 119, 157));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(187, 184, 162));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        nome.setForeground(new java.awt.Color(254, 254, 254));
        nome.setText("BlackJack");
        nome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        nome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 70));

        ajuda.setForeground(new java.awt.Color(254, 254, 254));
        ajuda.setText("AJUDA");
        ajuda.setToolTipText("");
        ajuda.setOpaque(false);

        ajuda.setContentAreaFilled(false);

        ajuda.setBorderPainted(false);
        ajuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajudaActionPerformed(evt);
            }
        });
        jPanel1.add(ajuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 150, 40));

        manete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641782_gamecontroller.png"))); // NOI18N
        jPanel1.add(manete, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        gameMode.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        gameMode.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(gameMode, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 210, 20));

        btn1Player.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        btn1Player.setForeground(new java.awt.Color(254, 254, 254));
        btn1Player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641782_gamecontroller.png"))); // NOI18N
        btn1Player.setBorderPainted(false);
        btn1Player.setContentAreaFilled(false);
        btn1Player.setFocusPainted(false);
        btn1Player.setIconTextGap(-280);
        btn1Player.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1PlayerMouseEntered(evt);
            }
        });
        btn1Player.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1PlayerActionPerformed(evt);
            }
        });
        btn1Player.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btn1PlayerKeyTyped(evt);
            }
        });
        jPanel1.add(btn1Player, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 240, 130));

        btnPlayervsCpu.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        btnPlayervsCpu.setForeground(new java.awt.Color(255, 214, 0));
        btnPlayervsCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641816_computer.png"))); // NOI18N
        btnPlayervsCpu.setBorderPainted(false);
        btnPlayervsCpu.setContentAreaFilled(false);
        btnPlayervsCpu.setFocusPainted(false);
        btnPlayervsCpu.setIconTextGap(-240);
        btnPlayervsCpu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayervsCpuMouseEntered(evt);
            }
        });
        btnPlayervsCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayervsCpuActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlayervsCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 240, 130));

        btn2Players.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        btn2Players.setForeground(new java.awt.Color(1, 1, 1));
        btn2Players.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641782_gamecontroller.png"))); // NOI18N
        btn2Players.setAutoscrolls(true);
        btn2Players.setBorderPainted(false);
        btn2Players.setContentAreaFilled(false);
        btn2Players.setFocusPainted(false);
        btn2Players.setIconTextGap(-295);
        btn2Players.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2PlayersMouseEntered(evt);
            }
        });
        btn2Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2PlayersActionPerformed(evt);
            }
        });
        jPanel1.add(btn2Players, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, -1, 140));

        jLabel6.setBackground(new java.awt.Color(1, 1, 1));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 770, 40));

        fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/blackjack2.jpg"))); // NOI18N
        fundo1.setText("HIT");
        jPanel1.add(fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        pontuacao.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("PONTUAÇÃO PLAYER 1");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("PONTUAÇÃO PLAYER 2");

        p1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        p1.setText("0");

        p2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        p2.setText("0");

        javax.swing.GroupLayout pontuacaoLayout = new javax.swing.GroupLayout(pontuacao);
        pontuacao.setLayout(pontuacaoLayout);
        pontuacaoLayout.setHorizontalGroup(
            pontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontuacaoLayout.createSequentialGroup()
                .addGroup(pontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pontuacaoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(pontuacaoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(p2))
                    .addGroup(pontuacaoLayout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(p1)))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(pontuacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pontuacaoLayout.setVerticalGroup(
            pontuacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pontuacaoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p2)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p1)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jPanel1.add(pontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        pontuacao.setVisible(false);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        hit.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        hit.setForeground(new java.awt.Color(254, 254, 254));
        hit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641858_arrow-down.png"))); // NOI18N
        hit.setText("HIT");
        hit.setBorderPainted(false);
        hit.setContentAreaFilled(false);
        hit.setFocusPainted(false);
        hit.setVisible(false);
        hit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitActionPerformed(evt);
            }
        });
        hit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hitKeyTyped(evt);
            }
        });
        jPanel2.add(hit);

        burn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        burn.setForeground(new java.awt.Color(254, 254, 254));
        burn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641762_flame.png"))); // NOI18N
        burn.setText("BURN");
        burn.setBorderPainted(false);
        burn.setContentAreaFilled(false);
        burn.setFocusPainted(false);
        burn.setVisible(false);
        burn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burnActionPerformed(evt);
            }
        });
        jPanel2.add(burn);

        stop.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        stop.setForeground(new java.awt.Color(254, 254, 254));
        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/1490641855_denied.png"))); // NOI18N
        stop.setText("STOP");
        stop.setBorderPainted(false);
        stop.setContentAreaFilled(false);
        stop.setFocusPainted(false);
        stop.setVisible(false);
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        jPanel2.add(stop);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 730, 130));
        jPanel2.setOpaque(false);

        monte.setVisible(false);
        monte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        monte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monteActionPerformed(evt);
            }
        });
        jPanel1.add(monte, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 70, 100));

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });
        jPanel1.add(carta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, 100));
        carta1.setVisible(false);

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        jPanel1.add(carta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 70, 100));
        carta2.setVisible(false);

        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        jPanel1.add(carta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 70, 100));
        carta3.setVisible(false);

        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        jPanel1.add(carta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 70, 100));
        carta4.setVisible(false);

        cartamesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/back.png"))); // NOI18N
        cartamesa.setVisible(false);
        jPanel1.add(cartamesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 70, 100));

        fundo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/lucky_8_line.jpg"))); // NOI18N
        fundo2.setText("jLabel1");
        jPanel1.add(fundo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        endGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/gameover.png"))); // NOI18N
        jPanel3.add(endGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 280, 240));

        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("PONTUAÇÃO FINAL: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, 30));

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("PLAYER 1: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("PLAYER 2:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, -1, -1));
        jPanel3.add(jBarrinha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 760, -1));

        pontp1.setText("0");
        jPanel3.add(pontp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        pontp2.setText("0");
        jPanel3.add(pontp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        winner.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        winner.setForeground(new java.awt.Color(254, 254, 254));
        winner.setText("PLAYER X VENCEU! ");
        jPanel3.add(winner, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, -1, 30));

        youwin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackjack/Imagens/YouWin.png"))); // NOI18N
        jPanel3.add(youwin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 780, 490));
        youwin.setVisible(false);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));
        jPanel3.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void setMode(BlackJack blackj, int mode){
        blackj.setModo(mode);
        setTurno(-1);
        Monte deck = new Monte();
        blackj.getMonte().setMonte(deck.montaDeck());
        Hand mao = new Hand();
        Hand mao2 = new Hand();
        Hand mao3 = new Hand();
        player1 = new Jogador("Paulin", mao);
        player2 = new Jogador("Marcin", mao2); 
        cpu = new Maquina("CPU", mao3);
        blackj.criaMao(player1);
        blackj.criaMao(player2);
        blackj.criaMao(cpu);
        mudarIcone(carta1, player1.getMao().getCarta(0));
        mudarIcone(carta2, player1.getMao().getCarta(1));
        if(mode == 2){
            mudarIcone(carta3, player2.getMao().getCarta(0));
            mudarIcone(carta4, player2.getMao().getCarta(1));
            String soma2 = "" + player2.somaMao();
            p1.setText(soma2);
        }
        String soma = "" + player1.somaMao();
        p2.setText(soma);
        if (mode == 3)
            p1.setText("?");
    }

    public void listenerJogo(){
        String soma = "" + player1.somaMao();
        p2.setText(soma);
        
        switch(blackj.getModo()){
            case 1:
                loopJogo(blackj.getMonte(), player1, blackj.getLevel());
            break;
            case 2:
                String soma2 = "" + player2.somaMao();
                loopJogo(blackj.getMonte(), player1, player2,  blackj.getLevel());
                p1.setText(soma2);
            break;
            case 3:
                loopJogo(blackj.getMonte(), player1, cpu, blackj.getLevel());
                p1.setText("?");
            break;
        }
    }
    
    public void loopJogo(Monte deck, Jogador player1, int nivel) {
        if (nivel == 1){
            mudarIcone(monte, deck.getMonte().peek());
        }
        switch (blackj.getOp()) {
            case 2:
                Carta c = deck.getMonte().pop();
                mudarIcone(cartamesa, c);
                break;
            case 3:
                player1.setPont(player1.somaMao());
                gameOver(3);
                break;
            case 1:
                Carta c2 = deck.getMonte().pop();
                player1.getMao().addCarta(c2);
                player1.setPont(player1.somaMao());
                mudarIcone(cartamesa, c2);
                break;
            default:
                break;    
        }
        
        String string = "" + player1.somaMao();
        p2.setText(string);
        
        if (nivel == 1){
            mudarIcone(monte, deck.getMonte().peek());
        }
        if (player1.getPont() == 21){
            gameOver(1);
        }
        else if (player1.getPont() > 21){
            gameOver(2);
        } 
    }
    
    public void jogacpu(Monte deck, int nivel){
        if (nivel == 1) mudarIcone(monte, deck.getMonte().peek());
        int op;
        if (cpu.getPont() < 20) op = 1;
        else op = 3;
    
        switch (op) {
            case 2:
                Carta c = deck.getMonte().pop();
                mudarIcone(cartamesa, c);
                break;
            case 3:
                cpu.setPont(cpu.somaMao());
                cpu.setJoga(0);
                break;
            case 1:
                Carta c2 = deck.getMonte().pop();
                cpu.getMao().addCarta(c2);
                cpu.setPont(cpu.somaMao());
                mudarIcone(cartamesa, c2);
                break;
            default:
                break;
        }
        if (cpu.somaMao() > 21){
            cpu.setJoga(0);
    }
    }
    
    public void joga1(Monte deck, int nivel){
        if (nivel == 1) mudarIcone(monte, deck.getMonte().peek());
        
        switch (blackj.getOp()) {
            case 2:
                Carta c = deck.getMonte().pop();
                mudarIcone(cartamesa, c);
                break;
            case 3:
                this.player1.setJoga(0);
                break;
            case 1:
                Carta c2 = deck.getMonte().pop();
                player1.getMao().addCarta(c2);
                mudarIcone(cartamesa, c2);
                break;
            default:
                break;
        }
        if (player1.somaMao() > 21){
            this.player1.setJoga(0);
    }
    }
    
    public void joga2(Monte deck, int nivel){
        if (nivel == 1) mudarIcone(monte, deck.getMonte().peek());
        
        switch (blackj.getOp()) {
            case 2:
                Carta c = deck.getMonte().pop();
                mudarIcone(cartamesa, c);
                break;
            case 3:
                this.player2.setJoga(0);
                break;
            case 1:
                Carta c2 = deck.getMonte().pop();
                player2.getMao().addCarta(c2);
                mudarIcone(cartamesa, c2);
                break;
            default:
                break;
        }
        if (player2.somaMao() > 21){
            this.player2.setJoga(0);
    }
    }
        
    public void loopJogo(Monte deck, Jogador player, Jogador playerr, int nivel){
        setTurno((-1)*getTurno());
        if (player1.getJoga() == 0)
            setTurno(-1);
        if (player2.getJoga() == 0)
            setTurno(1);
        
        if (player1.getJoga() == 1){
            if (getTurno() == 1)
                joga1(deck, nivel);
            if (player1.somaMao() == 21)
               gameOver(7);
        }
        if (player2.getJoga() == 1){
            if (getTurno() == -1)
                joga2(deck, nivel);
            if (player2.somaMao() == 21)
               gameOver(4);
        }
        
        if (nivel == 1){
            mudarIcone(monte, deck.getMonte().peek());
        }
        
        String string = "" + player1.somaMao();
        p2.setText(string);
        string = "" + player2.somaMao();
        p1.setText(string);
        
        int soma1 = player1.somaMao();
        int soma2 = player2.somaMao();
        
        if(this.player1.getJoga() == 0 && this.player2.getJoga() == 0){
            if (soma1 < 21 && soma1 > soma2 || soma2 > 21 && soma2 > soma1)
                gameOver(7);
            else if (soma2 < 21 && soma1 < soma2 || soma1 > 21 && soma1 > soma2) 
                gameOver(4);
        }
        
    }

    public void loopJogo(Monte deck, Jogador player, Maquina pc, int nivel) {        
        if (player1.getJoga() == 1){   
                joga1(deck, nivel);
            if (player1.somaMao() == 21)
               gameOver(6);
        }
        
        if (cpu.getJoga() == 1){
                jogacpu(deck, nivel);
            if (cpu.somaMao() == 21)
               gameOver(5);    
        }
        
        while (player1.getJoga() == 0 && cpu.getJoga() == 1){
            jogacpu(deck, nivel);
            if (cpu.somaMao() == 21)
               gameOver(5); 
        }
        if (nivel == 1){
            mudarIcone(monte, deck.getMonte().peek());
        }
        
        String string = "" + player1.somaMao();
        p2.setText(string);
        p1.setText("?");
        
        int soma1 = player1.somaMao();
        int soma2 = cpu.somaMao();
        if(this.player1.getJoga() == 0 && this.cpu.getJoga() == 0){
        if (soma1 < 21 && soma1 > soma2 || soma2 > 21 && soma2 > soma1)
            gameOver(6);
        else if (soma2 < 21 && soma1 < soma2 || soma1 > 21 && soma1 > soma2)
            gameOver(5); 
        
        }
    }

    
    public void onePlayer(){
        nome.setVisible(false);
        manete.setVisible(false);
        btn1Player.setVisible(false);
        btn2Players.setVisible(false);
        btnPlayervsCpu.setVisible(false);
        fundo1.setVisible(false);
        fundo2.setVisible(true);
        ajuda.setVisible(false);
        hit.setVisible(true);
        burn.setVisible(true);
        monte.setVisible(true);
        stop.setVisible(true);
        gameMode.setVisible(false);
        carta1.setVisible(true);
        carta2.setVisible(true);
        carta3.setVisible(true);
        carta4.setVisible(true);
        pontuacao.setVisible(true);
        p1.setVisible(false);
        jLabel7.setVisible(false);
        cartamesa.setVisible(true);
        setMode(blackj, 1);
        if (blackj.getLevel() == 1)
            mudarIcone(monte, blackj.getMonte().getMonte().peek());
    }
    
    public void twoPlayers(){
        nome.setVisible(false);
        manete.setVisible(false);
        btn1Player.setVisible(false);
        btn2Players.setVisible(false);
        btnPlayervsCpu.setVisible(false);
        fundo1.setVisible(false);
        fundo2.setVisible(true);
        ajuda.setVisible(false);
        hit.setVisible(true);
        burn.setVisible(true);
        stop.setVisible(true);
        monte.setVisible(true);
        gameMode.setVisible(false);
        carta1.setVisible(true);
        carta2.setVisible(true);
        carta3.setVisible(true);
        pontuacao.setVisible(true);
        carta4.setVisible(true);
        cartamesa.setVisible(true);
        setMode(blackj, 2);
        if (blackj.getLevel() == 1)
            mudarIcone(monte, blackj.getMonte().getMonte().peek());
    }
    
    public void vsCpu(){
        monte.setVisible(true);
        manete.setVisible(false);
        nome.setVisible(false);
        btn1Player.setVisible(false);
        btn2Players.setVisible(false);
        btnPlayervsCpu.setVisible(false);
        fundo1.setVisible(false);
        fundo2.setVisible(true);
        gameMode.setVisible(false);
        ajuda.setVisible(false);
        hit.setVisible(true);
        burn.setVisible(true);
        pontuacao.setVisible(true);
        stop.setVisible(true);
        carta1.setVisible(true);
        carta2.setVisible(true);
        carta3.setVisible(true);
        carta4.setVisible(true);
        cartamesa.setVisible(true);
        setMode(blackj, 3);
        if (blackj.getLevel() == 1)
            mudarIcone(monte, blackj.getMonte().getMonte().peek());
    }
    
    private void btn1PlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1PlayerActionPerformed
        onePlayer();
    }//GEN-LAST:event_btn1PlayerActionPerformed

    private void btn2PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2PlayersActionPerformed
        twoPlayers();
    }//GEN-LAST:event_btn2PlayersActionPerformed

    private void btnPlayervsCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayervsCpuActionPerformed
        vsCpu();
    }//GEN-LAST:event_btnPlayervsCpuActionPerformed

    private void ajudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajudaActionPerformed
        blackj.setLevel(1);
    }//GEN-LAST:event_ajudaActionPerformed

    private void hitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitActionPerformed
        blackj.setOp(1);
        listenerJogo();
    }//GEN-LAST:event_hitActionPerformed

    private void burnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burnActionPerformed
        blackj.setOp(2);
        listenerJogo();
    }//GEN-LAST:event_burnActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        blackj.setOp(3);
        listenerJogo();
    }//GEN-LAST:event_stopActionPerformed

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carta1ActionPerformed

    private void monteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monteActionPerformed

    private void btn1PlayerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1PlayerMouseEntered
        gameMode.setVisible(true);
        gameMode.setText("UM JOGADOR");
    }//GEN-LAST:event_btn1PlayerMouseEntered

    private void btn2PlayersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2PlayersMouseEntered
        gameMode.setVisible(true);
        gameMode.setText("DOIS JOGADORES");
    }//GEN-LAST:event_btn2PlayersMouseEntered

    private void btnPlayervsCpuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayervsCpuMouseEntered
        gameMode.setVisible(true);
        gameMode.setText("VS CPU");
    }//GEN-LAST:event_btnPlayervsCpuMouseEntered

    private void btn1PlayerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn1PlayerKeyTyped
        char c = evt.getKeyChar();
        if (c == '1')
            onePlayer();
        if (c == '2')
            twoPlayers();
        if (c == '3')
            vsCpu();
    }//GEN-LAST:event_btn1PlayerKeyTyped

    private void hitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hitKeyTyped
        char c = evt.getKeyChar();
        if (c == '1')
            blackj.setOp(1);
        if (c == '2')
            blackj.setOp(2); 
        if (c == '3')
            blackj.setOp(3);
        
        listenerJogo();
    }//GEN-LAST:event_hitKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ajuda;
    private javax.swing.JButton btn1Player;
    private javax.swing.JButton btn2Players;
    private javax.swing.JButton btnPlayervsCpu;
    private javax.swing.JButton burn;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JButton carta4;
    private javax.swing.JButton cartamesa;
    private javax.swing.JLabel endGame;
    private javax.swing.JLabel fundo1;
    private javax.swing.JLabel fundo2;
    private javax.swing.JLabel gameMode;
    private javax.swing.JButton hit;
    private javax.swing.JProgressBar jBarrinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel manete;
    private javax.swing.JButton monte;
    private javax.swing.JLabel nome;
    private javax.swing.JButton p1;
    private javax.swing.JButton p2;
    private javax.swing.JButton pontp1;
    private javax.swing.JButton pontp2;
    private javax.swing.JPanel pontuacao;
    private javax.swing.JButton stop;
    private javax.swing.JLabel winner;
    private javax.swing.JLabel youwin;
    // End of variables declaration//GEN-END:variables

    public JButton getCarta1() {
        return carta1;
    }

    public void setCarta1(JButton carta1) {
        this.carta1 = carta1;
    }

    public JButton getCarta2() {
        return carta2;
    }

    public void setCarta2(JButton carta2) {
        this.carta2 = carta2;
    }

    public JButton getCarta3() {
        return carta3;
    }

    public void setCarta3(JButton carta3) {
        this.carta3 = carta3;
    }

    public JButton getCarta4() {
        return carta4;
    }

    public void setCarta4(JButton carta4) {
        this.carta4 = carta4;
    }

    public JButton getCartamesa() {
        return cartamesa;
    }

    public void setCartamesa(JButton cartamesa) {
        this.cartamesa = cartamesa;
    }

    private void mudarIcone(JButton button, Carta carta) {
        String s;
        s = "/blackjack/Imagens/" + carta.getValor().getNome() + "-" + carta.getNipe().getNome() + ".png";
        Icon i = (new javax.swing.ImageIcon(getClass().getResource(s)));
        button.setIcon(i);
    } 
    
    private void gameOver(int caso) {
        jPanel2.setVisible(false);
        fundo2.setVisible(false);
        hit.setVisible(false);
        burn.setVisible(false);
        stop.setVisible(false);
        carta1.setVisible(false);
        carta2.setVisible(false);
        carta3.setVisible(false);
        carta4.setVisible(false);
        cartamesa.setVisible(false);
        monte.setVisible(false);
        jPanel3.setVisible(true);
        String pontua = "" + player1.somaMao();
        String pontua2 = "" + player2.somaMao();
        String pontua3 = "" + cpu.somaMao();
        pontp1.setText(pontua);
        pontuacao.setVisible(false);
        switch(caso){
            case 1:
                winner.setText("Player 1 venceu!");
                pontp2.setVisible(false);
                endGame.setVisible(false);
                jLabel5.setVisible(false);
                youwin.setVisible(true);         
            case 2:
                winner.setText("Player 1 estourou!");
                pontp2.setVisible(false);
                jLabel5.setVisible(false);
            break;
            case 3:
                winner.setText("Player 1 parou!");
                pontp2.setVisible(false);
                jLabel5.setVisible(false);
            break;
            case 4:
                winner.setText("Player 2 venceu!");
                pontp2.setText(pontua2);
            break;
            case 5:
                winner.setText("CPU venceu!");
                pontp2.setText(pontua3);
            break;
            case 6:
                winner.setText("Player 1 venceu!");
                pontp2.setText(pontua3);
                endGame.setVisible(false);
                youwin.setVisible(true);
            break;
            case 7:
                winner.setText("Player 1 venceu!");
                pontp2.setText(pontua2);
                endGame.setVisible(false);
                youwin.setVisible(true);
            break;
        }
        
        carregar();        
    }

    private void carregar() {
        ActionListener acao = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if(jBarrinha.getValue()< 100){
                    jBarrinha.setValue(jBarrinha.getValue()+2);
                }
                else{
                    timerBarrinha.stop();
                    setVisible(false);
                    dispose();
                    BlackJack.novoJogo();
                }
            }
        };
        timerBarrinha = new Timer(100, acao);
        timerBarrinha.start();
    }
}
