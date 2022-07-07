/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela.java
 *
 * Created on 03/03/2011, 18:28:20
 */
package Controler;

import Modelo.Porta;
import Modelo.Personagem;
import Modelo.Caveira;
import Modelo.Lolo;
import Modelo.BichinhoVaiVemHorizontal;
import Auxiliar.Consts;
import Auxiliar.Desenho;
import Modelo.Arvore;
import Modelo.Bau;
import Modelo.Coracao;
import Modelo.Parede;
import Modelo.Pedra;
import Modelo.ZigueZague;
import auxiliar.Posicao;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.swing.JButton;

/**
 *
 * @author junio
 */
public class Tela extends javax.swing.JFrame implements MouseListener, KeyListener {

    Lolo lLolo;
    Bau b1;
    Porta p1;
    ArrayList<Personagem> e;
    private ControleDeJogo cj = new ControleDeJogo();
    private Graphics g2;
    private int nCoracoes;
    private int iFase;

     /*
     * Creates new form tabuleiro
     */
    
    public Tela(int n){
        Desenho.setCenario(this);
        initComponents();
        this.addMouseListener(this); /*mouse*/
        this.addKeyListener(this);   /*teclado*/
        
        /*Cria a janela do tamanho do tabuleiro + insets (bordas) da janela*/
        this.setSize(Consts.RES * Consts.CELL_SIDE + getInsets().left + getInsets().right,
                Consts.RES * Consts.CELL_SIDE + getInsets().top + getInsets().bottom);
        e = new ArrayList<Personagem>(169);
        iFase = n;
        
        
        if(iFase==1){
            this.nCoracoes = 6;
            
            /*Cria e adiciona personagens*/
            lLolo = new Lolo("lolo.png");
            lLolo.setPosicao(8, 6);
            this.addPersonagem(lLolo);
            
             // adiciona bau
            b1 = new Bau("bau.png");
            b1.setPosicao(3, 6);
            this.addPersonagem(b1);
            
            // adiciona porta
            p1 = new Porta("porta.png");
            p1.setPosicao(0, 6);
            this.addPersonagem(p1);
            
        
            // adiciona muros
            Parede pMuro1 = new Parede("parede.png");
            pMuro1.setPosicao(0, 0);
            this.addPersonagem(pMuro1);
            
            Parede pMuro2 = new Parede("parede.png");
            pMuro2.setPosicao(1, 0);
            this.addPersonagem(pMuro2);
            
            Parede pMuro3 = new Parede("parede.png");
            pMuro3.setPosicao(2, 0);
            this.addPersonagem(pMuro3);
            
            Parede pMuro4 = new Parede("parede.png");
            pMuro4.setPosicao(3, 0);
            this.addPersonagem(pMuro4);
            
            Parede pMuro5 = new Parede("parede.png");
            pMuro5.setPosicao(4, 0);
            this.addPersonagem(pMuro5);
            
            Parede pMuro6 = new Parede("parede.png");
            pMuro6.setPosicao(5, 0);
            this.addPersonagem(pMuro6);
            
            Parede pMuro7 = new Parede("parede.png");
            pMuro7.setPosicao(6, 0);
            this.addPersonagem(pMuro7);
            
            Parede pMuro8 = new Parede("parede.png");
            pMuro8.setPosicao(7, 0);
            this.addPersonagem(pMuro8);
            
            Parede pMuro9 = new Parede("parede.png");
            pMuro9.setPosicao(8, 0);
            this.addPersonagem(pMuro9);
            
            Parede pMuro10 = new Parede("parede.png");
            pMuro10.setPosicao(9, 0);
            this.addPersonagem(pMuro10);
            
            Parede pMuro11 = new Parede("parede.png");
            pMuro11.setPosicao(10, 0);
            this.addPersonagem(pMuro11);
            
            Parede pMuro12 = new Parede("parede.png");
            pMuro12.setPosicao(11, 0);
            this.addPersonagem(pMuro12);
            
            Parede pMuro13 = new Parede("parede.png");
            pMuro13.setPosicao(12, 0);
            this.addPersonagem(pMuro13);
            
            Parede pMuro14 = new Parede("parede.png");
            pMuro14.setPosicao(0, 1);
            this.addPersonagem(pMuro14);
            
            Parede pMuro15 = new Parede("parede.png");
            pMuro15.setPosicao(0, 2);
            this.addPersonagem(pMuro15);
            
            Parede pMuro16 = new Parede("parede.png");
            pMuro16.setPosicao(0, 3);
            this.addPersonagem(pMuro16);
            
            Parede pMuro17 = new Parede("parede.png");
            pMuro17.setPosicao(0, 4);
            this.addPersonagem(pMuro17);
            
            Parede pMuro18 = new Parede("parede.png");
            pMuro18.setPosicao(0, 5);
            this.addPersonagem(pMuro18);
            
            Parede pMuro20 = new Parede("parede.png");
            pMuro20.setPosicao(0, 7);
            this.addPersonagem(pMuro20);
            
            Parede pMuro21 = new Parede("parede.png");
            pMuro21.setPosicao(0, 8);
            this.addPersonagem(pMuro21);
            
            Parede pMuro22 = new Parede("parede.png");
            pMuro22.setPosicao(0, 9);
            this.addPersonagem(pMuro22);
            
            Parede pMuro23 = new Parede("parede.png");
            pMuro23.setPosicao(0, 10);
            this.addPersonagem(pMuro23);
            
            Parede pMuro24 = new Parede("parede.png");
            pMuro24.setPosicao(0, 11);
            this.addPersonagem(pMuro24);
            
            Parede pMuro25 = new Parede("parede.png");
            pMuro25.setPosicao(0, 12);
            this.addPersonagem(pMuro25);
            
            Parede pMuro26 = new Parede("parede.png");
            pMuro26.setPosicao(12, 1);
            this.addPersonagem(pMuro26);
            
            Parede pMuro27 = new Parede("parede.png");
            pMuro27.setPosicao(12, 2);
            this.addPersonagem(pMuro27);
            
            Parede pMuro28 = new Parede("parede.png");
            pMuro28.setPosicao(12, 3);
            this.addPersonagem(pMuro28);
            
            Parede pMuro29 = new Parede("parede.png");
            pMuro29.setPosicao(12, 4);
            this.addPersonagem(pMuro29);
            
            Parede pMuro30 = new Parede("parede.png");
            pMuro30.setPosicao(12, 5);
            this.addPersonagem(pMuro30);
            
            Parede pMuro31 = new Parede("parede.png");
            pMuro31.setPosicao(12, 6);
            this.addPersonagem(pMuro31);
            
            Parede pMuro32 = new Parede("parede.png");
            pMuro32.setPosicao(12, 7);
            this.addPersonagem(pMuro32);
            
            Parede pMuro33 = new Parede("parede.png");
            pMuro33.setPosicao(12, 8);
            this.addPersonagem(pMuro33);
            
            Parede pMuro34 = new Parede("parede.png");
            pMuro34.setPosicao(12, 9);
            this.addPersonagem(pMuro34);
            
            Parede pMuro35 = new Parede("parede.png");
            pMuro35.setPosicao(12, 10);
            this.addPersonagem(pMuro35);
            
            Parede pMuro36 = new Parede("parede.png");
            pMuro36.setPosicao(12, 11);
            this.addPersonagem(pMuro36);
            
            Parede pMuro37 = new Parede("parede.png");
            pMuro37.setPosicao(1, 12);
            this.addPersonagem(pMuro37);
            
            Parede pMuro38 = new Parede("parede.png");
            pMuro38.setPosicao(2, 12);
            this.addPersonagem(pMuro38);
            
            Parede pMuro39 = new Parede("parede.png");
            pMuro39.setPosicao(3, 12);
            this.addPersonagem(pMuro39);
            
            Parede pMuro40 = new Parede("parede.png");
            pMuro40.setPosicao(4, 12);
            this.addPersonagem(pMuro40);
            
            Parede pMuro41 = new Parede("parede.png");
            pMuro41.setPosicao(5, 12);
            this.addPersonagem(pMuro41);
            
            Parede pMuro42 = new Parede("parede.png");
            pMuro42.setPosicao(6, 12);
            this.addPersonagem(pMuro42);
            
            Parede pMuro43 = new Parede("parede.png");
            pMuro43.setPosicao(7, 12);
            this.addPersonagem(pMuro43);
            
            Parede pMuro44 = new Parede("parede.png");
            pMuro44.setPosicao(8, 12);
            this.addPersonagem(pMuro44);
            
            Parede pMuro45 = new Parede("parede.png");
            pMuro45.setPosicao(9,12);
            this.addPersonagem(pMuro45);
            
            Parede pMuro46 = new Parede("parede.png");
            pMuro46.setPosicao(10, 12);
            this.addPersonagem(pMuro46);
            
            Parede pMuro47 = new Parede("parede.png");
            pMuro47.setPosicao(11, 12);
            this.addPersonagem(pMuro47);
            
            Parede pMuro48 = new Parede("parede.png");
            pMuro48.setPosicao(12, 12);
            this.addPersonagem(pMuro48);
            
            
            // adiciona criaturas
            BichinhoVaiVemHorizontal bBichinhoH = new BichinhoVaiVemHorizontal("bichinho.png");
            bBichinhoH.setPosicao(2, 2);
            this.addPersonagem(bBichinhoH);

            BichinhoVaiVemHorizontal bBichinhoH2 = new BichinhoVaiVemHorizontal("bichinho.png");
            bBichinhoH2.setPosicao(6, 4);
            this.addPersonagem(bBichinhoH2);

            BichinhoVaiVemHorizontal bBichinhoH3 = new BichinhoVaiVemHorizontal("bichinho.png");
            bBichinhoH3.setPosicao(6, 8);
            this.addPersonagem(bBichinhoH3);
            
            
            // adiciona coraçoes
            Coracao c1 = new Coracao("coracao.png");
            c1.setPosicao(2, 1);
            this.addPersonagem(c1);
            
            Coracao c2 = new Coracao("coracao.png");
            c2.setPosicao(1, 8);
            this.addPersonagem(c2);
            
            Coracao c3 = new Coracao("coracao.png");
            c3.setPosicao(1, 11);
            this.addPersonagem(c3);
            
            Coracao c4 = new Coracao("coracao.png");
            c4.setPosicao(11, 2);
            this.addPersonagem(c4);
            
            Coracao c5 = new Coracao("coracao.png");
            c5.setPosicao(11, 8);
            this.addPersonagem(c5);
            
            Coracao c6 = new Coracao("coracao.png");
            c6.setPosicao(11, 9);
            this.addPersonagem(c6);
            
            
            //adiciona pedras
            Pedra p1 = new Pedra("pedra.png");
            p1.setPosicao(1, 1);
            this.addPersonagem(p1);
            
            Pedra p2 = new Pedra("pedra.png");
            p2.setPosicao(2, 8);
            this.addPersonagem(p2);
            
            Pedra p3 = new Pedra("pedra.png");
            p3.setPosicao(3, 1);
            this.addPersonagem(p3);
            
            Pedra p4 = new Pedra("pedra.png");
            p4.setPosicao(3, 8);
            this.addPersonagem(p4);
            
            Pedra p5 = new Pedra("pedra.png");
            p5.setPosicao(3, 9);
            this.addPersonagem(p5);
            
            Pedra p6 = new Pedra("pedra.png");
            p6.setPosicao(4, 9);
            this.addPersonagem(p6);
            
            Pedra p7 = new Pedra("pedra.png");
            p7.setPosicao(9, 11);
            this.addPersonagem(p7);
            
            Pedra p8 = new Pedra("pedra.png");
            p8.setPosicao(10, 1);
            this.addPersonagem(p8);
            
            Pedra p9 = new Pedra("pedra.png");
            p9.setPosicao(10, 5);
            this.addPersonagem(p9);
            
            Pedra p10 = new Pedra("pedra.png");
            p10.setPosicao(10, 6);
            this.addPersonagem(p10);
            
            Pedra p11 = new Pedra("pedra.png");
            p11.setPosicao(10, 10);
            this.addPersonagem(p11);
            
            Pedra p12 = new Pedra("pedra.png");
            p12.setPosicao(11, 1);
            this.addPersonagem(p12);
            
            Pedra p13 = new Pedra("pedra.png");
            p13.setPosicao(11, 4);
            this.addPersonagem(p13);
            
            Pedra p14 = new Pedra("pedra.png");
            p14.setPosicao(11, 5);
            this.addPersonagem(p14);
            
            
            //adiciona arvores
            Arvore a1 = new Arvore("arvore.png");
            a1.setPosicao(1, 9);
            this.addPersonagem(a1);
            
            Arvore a2 = new Arvore("arvore.png");
            a2.setPosicao(1, 10);
            this.addPersonagem(a2);
            
            Arvore a3 = new Arvore("arvore.png");
            a3.setPosicao(2, 3);
            this.addPersonagem(a3);
            
            Arvore a4 = new Arvore("arvore.png");
            a4.setPosicao(2, 4);
            this.addPersonagem(a4);
            
            Arvore a5 = new Arvore("arvore.png");
            a5.setPosicao(2, 9);
            this.addPersonagem(a5);
            
            Arvore a6 = new Arvore("arvore.png");
            a6.setPosicao(2, 10);
            this.addPersonagem(a6);
            
            Arvore a7 = new Arvore("arvore.png");
            a7.setPosicao(3, 3);
            this.addPersonagem(a7);
            
            Arvore a8 = new Arvore("arvore.png");
            a8.setPosicao(3, 4);
            this.addPersonagem(a8);
            
            Arvore a9 = new Arvore("arvore.png");
            a9.setPosicao(3, 10);
            this.addPersonagem(a9);
            
            Arvore a10 = new Arvore("arvore.png");
            a10.setPosicao(4, 1);
            this.addPersonagem(a10);
            
            Arvore a11 = new Arvore("arvore.png");
            a11.setPosicao(7, 1);
            this.addPersonagem(a11);
            
            Arvore a12 = new Arvore("arvore.png");
            a12.setPosicao(8, 1);
            this.addPersonagem(a12);
            
            Arvore a13 = new Arvore("arvore.png");
            a13.setPosicao(8, 2);
            this.addPersonagem(a13);
            
            Arvore a14 = new Arvore("arvore.png");
            a14.setPosicao(9, 1);
            this.addPersonagem(a14);
            
            Arvore a15 = new Arvore("arvore.png");
            a15.setPosicao(9, 2);
            this.addPersonagem(a15);
            
            Arvore a16 = new Arvore("arvore.png");
            a16.setPosicao(9, 7);
            this.addPersonagem(a16);
            
            Arvore a17 = new Arvore("arvore.png");
            a17.setPosicao(10, 7);
            this.addPersonagem(a17);
            
            Arvore a18 = new Arvore("arvore.png");
            a18.setPosicao(10, 11);
            this.addPersonagem(a18);
            
            Arvore a19 = new Arvore("arvore.png");
            a19.setPosicao(11, 6);
            this.addPersonagem(a19);
            
            Arvore a20 = new Arvore("arvore.png");
            a20.setPosicao(11, 7);
            this.addPersonagem(a20);
            
            Arvore a21 = new Arvore("arvore.png");
            a21.setPosicao(11, 10);
            this.addPersonagem(a21);
            
            Arvore a22 = new Arvore("arvore.png");
            a22.setPosicao(11, 11);
            this.addPersonagem(a22);
            
            
            // adiciona grama
            Grama g1 = new Grama("grama.png");
            g1.setPosicao(5, 1);
            this.addPersonagem(g1);
            
            Grama g2 = new Grama("grama.png");
            g2.setPosicao(6, 1);
            this.addPersonagem(g2);
            
            Grama g3 = new Grama("grama.png");
            g3.setPosicao(6, 2);
            this.addPersonagem(g3);
            
            Grama g4 = new Grama("grama.png");
            g4.setPosicao(6, 11);
            this.addPersonagem(g4);
            
            Grama g5 = new Grama("grama.png");
            g5.setPosicao(7, 2);
            this.addPersonagem(g5);
            
            Grama g6 = new Grama("grama.png");
            g6.setPosicao(7, 11);
            this.addPersonagem(g6);
            
            Grama g7 = new Grama("grama.png");
            g7.setPosicao(8, 10);
            this.addPersonagem(g7);
            
            Grama g8 = new Grama("grama.png");
            g8.setPosicao(8, 11);
            this.addPersonagem(g8);
            
            Grama g9 = new Grama("grama.png");
            g9.setPosicao(9, 10);
            this.addPersonagem(g9);
        }
    }
    
    public void contaCoracoes(Personagem pTemp) {
        if(pTemp.getClass() == Coracao.class)
            this.nCoracoes--;
    }
    
    
    private void ganhaPoder(Coracao c) {
        if(lLolo.getPosicao().igual(c.getPosicao())){
                lLolo.iPoder += 2;
            }
    }

    public void addPersonagem(Personagem umPersonagem) {
        e.add(umPersonagem);
    }

    public void removePersonagem(Personagem umPersonagem) {
        e.remove(umPersonagem);
    }

    public Graphics getGraphicsBuffer(){
        return g2;
    }
    
    public void paint(Graphics gOld) {
        Graphics g = this.getBufferStrategy().getDrawGraphics();
        /*Criamos um contexto gráfico*/
        g2 = g.create(getInsets().left, getInsets().top, getWidth() - getInsets().right, getHeight() - getInsets().top);
        /*************Desenha cenário de fundo**************/
        for (int i = 0; i < Consts.RES; i++) {
            for (int j = 0; j < Consts.RES; j++) {
                try {
                    Image newImage = Toolkit.getDefaultToolkit().getImage(new java.io.File(".").getCanonicalPath() + Consts.PATH + "bricks.png");
                    g2.drawImage(newImage,
                            j * Consts.CELL_SIDE, i * Consts.CELL_SIDE, Consts.CELL_SIDE, Consts.CELL_SIDE, null);

                } catch (IOException ex) {
                    Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (!this.e.isEmpty()) {
            this.cj.desenhaTudo(e);
            if(nCoracoes>0){
                int itemp = nCoracoes;
                nCoracoes = itemp - this.cj.processaCoracao(e);
            }
            else if(this.cj.processaBau(e)){
                Bau bVazio = new Bau("bauvazio.png");
                b1.isVazio = true;
                Posicao posTemp = new Posicao(1, 1);
                posTemp = b1.getPosicao();
                bVazio.setPosicao(posTemp.getLinha(), posTemp.getColuna());
                this.addPersonagem(bVazio);
                Porta pAberta = new Porta("portaaberta.png");
                posTemp = p1.getPosicao();
                p1.setbTransponivel(true);
                pAberta.setbTransponivel(true);
                pAberta.setPosicao(posTemp.getLinha(), posTemp.getColuna());
                this.addPersonagem(pAberta);
                this.addPersonagem(lLolo);
            }
            else if(!b1.isVazio){
                Bau bAberto = new Bau("bauaberto.png");
                Posicao posTemp = new Posicao(1, 1);
                posTemp = b1.getPosicao();
                bAberto.setPosicao(posTemp.getLinha(), posTemp.getColuna());
                this.addPersonagem(bAberto);
            }
        }

        g.dispose();
        g2.dispose();
        if (!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        }
    }

    public void go() {
        TimerTask task = new TimerTask() {
            public void run() {
                repaint(); 
           }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, Consts.PERIOD);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_C) {
            this.e.clear();
        } else if (e.getKeyCode() == KeyEvent.VK_L) {
            try {
                File tanque = new File("c:\\temp\\POO.zip");
                FileInputStream canoOut = new FileInputStream(tanque);
                GZIPInputStream compactador = new GZIPInputStream(canoOut);
                ObjectInputStream serializador = new ObjectInputStream(compactador);
                this.e = (ArrayList<Personagem>)serializador.readObject();
                this.lLolo = (Lolo)this.e.get(0);
                serializador.close();
            } catch (Exception ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            try {
                File tanque = new File("c:\\temp\\POO.zip");
                tanque.createNewFile();
                FileOutputStream canoOut = new FileOutputStream(tanque);
                GZIPOutputStream compactador = new GZIPOutputStream(canoOut);
                ObjectOutputStream serializador = new ObjectOutputStream(compactador);
                serializador.writeObject(this.e);
                serializador.flush();
                serializador.close();
            } catch (IOException ex) {
                Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            lLolo.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            lLolo.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            lLolo.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            lLolo.moveRight();
        }
        if (!cj.ehPosicaoValida(this.e, lLolo.getPosicao())) {
            lLolo.voltaAUltimaPosicao();
        }

        this.setTitle("-> Cell: " + (lLolo.getPosicao().getColuna()) + ", "
                + (lLolo.getPosicao().getLinha()));

        //repaint(); /*invoca o paint imediatamente, sem aguardar o refresh*/
    }

    public void mousePressed(MouseEvent e) {
        /* Clique do mouse desligado
         int x = e.getX();
         int y = e.getY();
     
         this.setTitle("X: "+ x + ", Y: " + y +
         " -> Cell: " + (y/Consts.CELL_SIDE) + ", " + (x/Consts.CELL_SIDE));
        
         this.lLolo.getPosicao().setPosicao(y/Consts.CELL_SIDE, x/Consts.CELL_SIDE);
         */
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POO2015-1 - Adventures of lolo");
        setAutoRequestFocus(false);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
