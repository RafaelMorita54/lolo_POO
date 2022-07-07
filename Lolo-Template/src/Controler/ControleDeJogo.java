/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controler;

import Modelo.Bau;
import Modelo.Coracao;
import Modelo.Personagem;
import Modelo.Lolo;
import auxiliar.Posicao;
import java.util.ArrayList;

/**
 *
 * @author junio
 */
public class ControleDeJogo {
    public void desenhaTudo(ArrayList<Personagem> e){
        for(int i = 0; i < e.size(); i++){
            e.get(i).autoDesenho();
        }
    }
    
    public void processaTudo(ArrayList<Personagem> e){
        Lolo bBomberman = (Lolo)e.get(0);
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao()))
                if(pTemp.isbTransponivel() && !pTemp.isbParteDoChao()){
                    e.remove(pTemp);
                }
                else{
                    bBomberman.autoDesenho();
                }
        }        
    }
    
    public boolean processaBau(ArrayList<Personagem> e){
        Lolo bBomberman = (Lolo)e.get(0);
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao())){
                if(pTemp.isbTransponivel() && !pTemp.isbParteDoChao()){
                    e.remove(pTemp);
                }
                if(pTemp.getClass() == Bau.class){
                    return true;
                }
            }
            else{
                bBomberman.autoDesenho();
                return false;
            }
        }
        return false;
    }
    
    public int processaCoracao(ArrayList<Personagem> e){
        Lolo bBomberman = (Lolo)e.get(0);
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao())){
                if(pTemp.isbTransponivel() && !pTemp.isbParteDoChao()){
                    if(pTemp.getClass() == Coracao.class){
                        e.remove(pTemp);
                        return 1;
                    }
                    e.remove(pTemp);
                    return 0;
                }
                else{
                    bBomberman.autoDesenho();
                    return 0;
                }
            }
        }
        return 0;
    }
    
    
    
    /*Retorna true se a posicao p é válida para Lolo com relacao a todos os personagens no array*/
    public boolean ehPosicaoValida(ArrayList<Personagem> e, Posicao p){
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);            
            if(!pTemp.isbTransponivel())
                if(pTemp.getPosicao().igual(p))
                    return false;
        }        
        return true;
    }

}
