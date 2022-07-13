/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Helena
 */
public class Alma extends Personagem implements Serializable{
    public Alma(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(false);    
    }
}
