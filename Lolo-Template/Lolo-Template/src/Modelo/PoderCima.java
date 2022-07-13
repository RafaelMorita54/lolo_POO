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
public class PoderCima extends Personagem {
    
    public PoderCima(String sNomeImagePNG){
        super(sNomeImagePNG);
        this.bPoder = true;
    }
    
    @Override
    public void autoDesenho() {
        super.autoDesenho();
        if(!this.moveUp()){
            Desenho.getCenario().removePersonagem(this);
        }
    }
}
