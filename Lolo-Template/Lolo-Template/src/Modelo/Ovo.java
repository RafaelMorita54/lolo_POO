/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author rafaj
 */
public class Ovo extends Personagem {
    public String bichoOriginal;
    
    public Ovo(String stringNomePNG, String nomeMonstro){
        super(stringNomePNG);
        this.bTransponivel = false;
        this.bMonstro = true;
        this.bMovel = true;
        this.bichoOriginal = nomeMonstro;
    }
}
