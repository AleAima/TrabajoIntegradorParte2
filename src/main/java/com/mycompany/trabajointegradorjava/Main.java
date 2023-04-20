/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aleai
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
//-----------------Ubicarion de los archivos---------------------------------------------------//        
        String archivoDeRonda="Rondas.csv";
        String archivoDeParticipantes="Participantes.csv";

//-----------------LLamo al metodo para importar un Map de rondas---------------------------------------------------//
        Map<Integer,Ronda> rondas = ArchivoCSV.ImportarRondasCSV(archivoDeRonda);
        
//-----Creo una Lista para agregar los partidos disputados de las rondas------------------------//
        List<Partido>partidosDisputados=new ArrayList<>();
        for(Integer ronda : rondas.keySet()){
            partidosDisputados.addAll(rondas.get(ronda).getPartidos());      
        }
//-----------------LLamo al metodo para importar un Map de participantes---------------------------------------------------//        
       Map<Integer,Participante> participantes = ArchivoCSV.ImportarParticipantesCSV(archivoDeParticipantes,partidosDisputados);
       
         for(Integer id : participantes.keySet()){
            participantes.get(id).calcularPuntaje();
            System.out.println(participantes.get(id).getNombre()+"= "+participantes.get(id).getPuntaje());
        }
    }
}
