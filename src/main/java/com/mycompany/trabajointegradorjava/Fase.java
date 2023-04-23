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
public class Fase {
    private int id;
    List <Ronda> rondas;
    
    public Fase(int identificacion){
        this.id=identificacion;
        rondas=new ArrayList<>();
    }
    
}
