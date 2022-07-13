/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Personagem;

/**
 *
 * @author rafaj
 */
public class Grama extends Personagem {
    public Grama(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(true);
        this.setbParteDoChao(true);
    }
}
