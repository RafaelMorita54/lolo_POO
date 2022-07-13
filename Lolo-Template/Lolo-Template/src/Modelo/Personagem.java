/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import Controler.Tela;
import auxiliar.Posicao;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
public abstract class Personagem implements Serializable {

    protected ImageIcon iImage;
    protected Posicao pPosicao;
    protected boolean bTransponivel; /*Pode passar por cima?*/
    protected boolean bParteDoChao; /*grama ou agua*/
    protected boolean bMortal;       /*Se encostar, o Bomberman morre?*/
    protected boolean bMonstro;
    protected boolean bPoder;
    protected boolean bMovel;
    


    protected Personagem(String sNomeImagePNG) {
        this.pPosicao = new Posicao(1, 1);
        this.bTransponivel = true;
        this.bParteDoChao = false;
        this.bMortal = false;
        this.bPoder = false;
        this.bMovel = false;
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImage = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Posicao getPosicao() {
        /*TODO: Retirar este método para que objetos externos nao possam operar
         diretamente sobre a posição do Personagem*/
        return pPosicao;
    }

    public boolean isbTransponivel() {
        return bTransponivel;
    }
    
    public boolean isbParteDoChao() {
        return bParteDoChao;
    }
    
    public boolean isbMortal() {
        return bMortal;
    }
    
    public boolean isbMonstro() {
        return bMonstro;
    }
    
    public boolean isbPoder() {
        return bPoder;
    }
    
    public boolean isbMovel() {
        return bMovel;
    }
    
    public void setbParteDoChao(boolean bParteDoChao) {
        this.bParteDoChao = bParteDoChao;
    }
    
    public void setbTransponivel(boolean bTransponivel) {
        this.bTransponivel = bTransponivel;
    }
    
    public void setbMonstro(boolean isMonstro) {
        this.bMonstro = isMonstro;
    }
    
    public void setbMovel(boolean isMovel) {
        this.bMovel = isMovel;
    }

    public void autoDesenho(){
        Desenho.desenhar(this.iImage, pPosicao.getColuna(), pPosicao.getLinha());        
    }

    public boolean setPosicao(int linha, int coluna) {
        return pPosicao.setPosicao(linha, coluna);
    }

    public boolean moveUp() {
        return this.pPosicao.moveUp();
    }

    public boolean moveDown() {
        return this.pPosicao.moveDown();
    }

    public boolean moveRight() {
        return this.pPosicao.moveRight();
    }

    public boolean moveLeft() {
        return this.pPosicao.moveLeft();
    }
}
