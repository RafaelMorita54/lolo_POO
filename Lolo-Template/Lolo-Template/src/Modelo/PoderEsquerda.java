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
public class PoderEsquerda extends Personagem {
    
    public PoderEsquerda(String sNomeImagePNG){
        super(sNomeImagePNG);
        this.bPoder = true;
    }
    
    @Override
    public void autoDesenho() {
        super.autoDesenho();
        if(!this.moveLeft()){
            Desenho.getCenario().removePersonagem(this);
        }
    }
}
