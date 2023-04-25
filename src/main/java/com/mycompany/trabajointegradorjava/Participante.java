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
public class Participante {
    private int identificacion;
    private String nombre;
    private int puntaje;
    private int cantidadDeAciertos;
    private List<Pronostico>pronosticos;
    private List<PuntosExtras> puntosExtras;
    
    public Participante(int id, String nombre){
        this.identificacion=id;
        this.nombre=nombre;
        this.puntaje=0;
        this.cantidadDeAciertos=0;
        this.pronosticos=new ArrayList<>();
    }
    
     public Participante(int id, String nombre, Pronostico pronostico){
        this.identificacion=id;
        this.nombre=nombre;
        this.puntaje=0;
        this.cantidadDeAciertos=0;
        this.pronosticos=new ArrayList<>();
        this.pronosticos.add(pronostico);
    }
    
    public void agregarPronostico(Pronostico pronostico){
        pronosticos.add(pronostico);
    }
    
    public void calcularPuntaje(){
        for(Pronostico pronostico : this.pronosticos){
           this.puntaje=this.puntaje+pronostico.decirPuntajeDelPronostico();
        }
    }
    
    public void calcularAcierto(){
        int cantidad=0;
        for(Pronostico pronostico : this.pronosticos){
            if(pronostico.decirPuntajeDelPronostico()>0){
             this.cantidadDeAciertos=this.cantidadDeAciertos+cantidad;   
            }           
        }
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int getCantidadDeAciertos() {
        return cantidadDeAciertos;
    }

    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }
    
    public boolean existeElPronsotico(Pronostico pronos){
        
        
        Pronostico pronosticoEncontrado=this.pronosticos.stream()
                  .filter(pronostico -> pronostico.getPartido().getEquipoUno().getNombre()
                  .equals(pronos.getPartido().getEquipoUno().getNombre())
                  &&pronostico.getPartido().getEquipoDos().getNombre()
                   .equals(pronos.getPartido().getEquipoDos().getNombre())
                  &&pronostico.getResultado().equals(pronos.getResultado()))
                  .findAny()
                  .orElse(null);
        
        return pronosticoEncontrado != null;
    }
    
}
