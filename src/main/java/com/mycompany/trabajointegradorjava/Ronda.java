/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aleai
 */
public class Ronda {
    private final int ronda;
    private final List<Partido> partidos;
    
     public Ronda(int ronda){
        this.ronda=ronda;
        this.partidos=new ArrayList<>();
    }
    
    public Ronda(int ronda, Partido partido){
        this.ronda=ronda;
        this.partidos=new ArrayList<>();
        this.partidos.add(partido);
    }
    
    public void AgregarRonda(List<Partido> partidos){
        for(Partido partido : partidos){
           this.partidos.add(partido);
        }
        
    }
    
    public int getRonda() {
        return ronda;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }
    
    public void agregarPartido(Partido partido){
        
        if(!existePartido(partido)){
            this.partidos.add(partido); 
        }    
    }
    
    private boolean existePartido(Partido partido){
        for(Partido parti : this.getPartidos()){
            if(parti.getEquipoUno().getNombre().equals(partido.getEquipoUno().getNombre())&&
               parti.getEquipoDos().getNombre().equals(partido.getEquipoDos().getNombre())){
                return true;
            }
        }
        return false;
    }
}
