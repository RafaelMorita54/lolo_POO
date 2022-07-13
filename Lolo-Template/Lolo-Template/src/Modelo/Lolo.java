/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
public class Lolo extends Personagem implements Serializable{

    public int iVidas;
    public int iPoder;
    public Lolo() {
        super("lolo.png");
        this.iPoder = 0;
        this.iVidas = 5;
    }

    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }

    public void poderDireita() {
        if(this.iPoder>0){
            this.iPoder--;
            super.autoDesenho();
            PoderDireita p = new PoderDireita("poderdireita.png");
            p.setPosicao(pPosicao.getLinha(),pPosicao.getColuna());
            Desenho.getCenario().addPersonagem(p);
        }
    }

    public void poderEsquerda() {
        if(this.iPoder>0){
            this.iPoder--;
            super.autoDesenho();
            PoderEsquerda p = new PoderEsquerda("poderesquerda.png");
            p.setPosicao(pPosicao.getLinha(),pPosicao.getColuna());
            Desenho.getCenario().addPersonagem(p);  
        }  
    }

    public void poderCima() {
        if(this.iPoder>0){
            this.iPoder--;
            super.autoDesenho();
            PoderCima p = new PoderCima("podercima.png");
            p.setPosicao(pPosicao.getLinha(),pPosicao.getColuna());
            Desenho.getCenario().addPersonagem(p);  
        }
    }

    public void poderBaixo() {
        if(this.iPoder>0){
            this.iPoder--;
            super.autoDesenho();
            PoderBaixo p = new PoderBaixo("poderbaixo.png");
            p.setPosicao(pPosicao.getLinha(),pPosicao.getColuna());
            Desenho.getCenario().addPersonagem(p);  
        }
    }
}
