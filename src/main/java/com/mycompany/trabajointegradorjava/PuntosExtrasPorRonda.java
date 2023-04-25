/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

/**
 *
 * @author aleai
 */
public class PuntosExtrasPorRonda extends PuntosExtras{
    Ronda ronda;
    public PuntosExtrasPorRonda(Ronda ronda){
       
        this.ronda=ronda;
    }
    @Override
    public int calcularPuntosExtras() {
        int puntosExtras=0;
        for(Partido partido : this.ronda.getPartidos() ){
            
        }
      return puntosExtras; 
    }
    
    
}
