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
import Modelo.Ovo;
import Modelo.PoderDireita;
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
            processaPoder(pTemp, e);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao())){
                if(pTemp.isbTransponivel() && !pTemp.isbParteDoChao()){
                    e.remove(pTemp);
                }
                else{
                    bBomberman.autoDesenho();
                }
            }
        }        
    }
    
    public boolean processaBau(ArrayList<Personagem> e){
        Lolo bBomberman = (Lolo)e.get(0);
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            processaPoder(pTemp, e);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao())){
                if(pTemp.isbPoder()){
                    for(int j = 1; j < e.size(); j++){
                        Personagem pTemp2 = e.get(j);
                        if(pTemp.getPosicao().igual(pTemp2.getPosicao())){
                            if(pTemp2.isbTransponivel()){
                                e.remove(pTemp);
                            }
                        }
                    }
                }
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
            processaPoder(pTemp, e);
            if(bBomberman.getPosicao().igual(pTemp.getPosicao())){
                if(pTemp.isbMovel()){
                    if(!empurra(pTemp, e, bBomberman)){
                        if(pTemp.getClass()==Ovo.class){
                            e.remove(pTemp);
                        }
                        else{
                            bBomberman.getPosicao().volta();
                        }
                    }
                }
                if(pTemp.isbTransponivel() && !pTemp.isbParteDoChao()){
                    if(pTemp.getClass() == Coracao.class){
                        Coracao tmp = (Coracao) pTemp;      
                        e.remove(pTemp);
                        if(tmp.bPoder){
                            bBomberman.iPoder += 2;
                        }
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
    
    private void processaPoder(Personagem pTemp, ArrayList<Personagem> e){
        if(pTemp.isbPoder()){
            for(int j = 1; j < e.size(); j++){
                Personagem pTemp2 = e.get(j);
                if(pTemp.getPosicao().igual(pTemp2.getPosicao())){
                    if(!pTemp2.isbTransponivel()){
                        e.remove(pTemp);
                        if(pTemp2.isbMonstro()){
                            Ovo oTemp = new Ovo("ovo.png", "bichinhoverde");
                            Posicao posTemp = pTemp2.getPosicao();
                            oTemp.setPosicao(posTemp.getLinha(), posTemp.getColuna());
                            e.remove(pTemp2);
                            e.add(oTemp);
                        }
                    }
                }
            }
        }
    }
    
    private boolean empurra(Personagem pTemp, ArrayList<Personagem> e, Lolo bBomberman){
        Posicao posTemp = bBomberman.getPosicao();
        posTemp.volta();
        int coluna = posTemp.getColuna();
        int linha = posTemp.getLinha();
        posTemp.volta();
        Posicao pos2 = new Posicao(linha, coluna);
        if(ehPosicaoValidaMovel(e, pos2)){
            if(coluna<bBomberman.getPosicao().getColuna()){
                return pTemp.moveRight();
            }
            if(coluna>bBomberman.getPosicao().getColuna()){
                return pTemp.moveLeft();
            }
            if(linha<bBomberman.getPosicao().getLinha()){        
                return pTemp.moveDown();
            }
            return pTemp.moveUp();
        }
        return false;
    }
    
    
    
    
    /*Retorna true se a posicao p é válida para Lolo com relacao a todos os personagens no array*/
    public boolean ehPosicaoValida(ArrayList<Personagem> e, Posicao p){
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            if(pTemp.isbMovel()){
                return true;
            }
            if(!pTemp.isbTransponivel() && pTemp.getPosicao().igual(p)){
                return false;
            }
        } 
        return true;
    }
    
        public boolean ehPosicaoValidaMovel(ArrayList<Personagem> e, Posicao p){
        Personagem pTemp;
        for(int i = 1; i < e.size(); i++){
            pTemp = e.get(i);
            if(!pTemp.isbTransponivel() && pTemp.getPosicao().igual(p)){
                return false;
            }
        } 
        return true;
    }

}
