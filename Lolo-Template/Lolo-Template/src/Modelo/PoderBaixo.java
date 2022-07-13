/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Auxiliar.Desenho;

/**
 *
 * @author rafaj
 */
public class PoderBaixo extends Personagem {
    
    public PoderBaixo(String sNomeImagePNG){
        super(sNomeImagePNG);
        this.bPoder = true;
    }
    
    @Override
    public void autoDesenho() {
        super.autoDesenho();
        if(!this.moveDown()){
            Desenho.getCenario().removePersonagem(this);
        }
    }
}
