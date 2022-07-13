/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Junio
 */
public class BichinhoVaiVemHorizontal extends Personagem  implements Serializable{
    
    public BichinhoVaiVemHorizontal(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(false);
        this.setbMonstro(true);
    }
}
