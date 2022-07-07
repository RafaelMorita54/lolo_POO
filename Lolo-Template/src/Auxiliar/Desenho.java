/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import java.awt.Graphics;
import java.io.Serializable;
import javax.swing.ImageIcon;
import Controler.Tela;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author junio
 */
public class Desenho implements Serializable {
    static Tela jCenario;
    public static void setCenario(Tela umJCenario) {
        jCenario = umJCenario;
    }

    public static Tela getCenario() {
        return jCenario;
    }

    public static Graphics getGraphicsDaTela() {
        return jCenario.getGraphicsBuffer();
    }
    
    public static void desenhar(ImageIcon iImage, int iColuna, int iLinha) {
        iImage.paintIcon(jCenario,getGraphicsDaTela(),iColuna * Consts.CELL_SIDE, iLinha * Consts.CELL_SIDE);
    }
    
    public static void desenhoString(String sNomeImagePNG, int iColuna, int iLinha) throws IOException {
        ImageIcon iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
        Image img = iImage.getImage();
        BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
        iImage = new ImageIcon(bi);
        desenhar(iImage, iColuna, iLinha);
    }
}
