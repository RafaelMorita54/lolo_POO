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
    public Lolo(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.iPoder = 0;
        this.iVidas = 5;
    }

    public void voltaAUltimaPosicao(){
        this.pPosicao.volta();
    }
}
