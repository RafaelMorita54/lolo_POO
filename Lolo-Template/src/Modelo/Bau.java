/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rafaj
 */
public class Bau extends Personagem {
    
    public boolean isVazio = false;
    
    public Bau(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(true);
        this.setbParteDoChao(true);
    }
}
