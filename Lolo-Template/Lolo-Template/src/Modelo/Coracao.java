/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author rafaj
 */
public class Coracao extends Personagem implements Serializable{

    public boolean bPoder;
    
    public Coracao(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bPoder = false;
    }
}
