/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author aleai
 */
public class ArchivoCSV {
    
      public static Map<Integer,Ronda> ImportarRondasCSV(String nombreDelArchivo) {
          //Creo el Map que va a retornar el metodo
          Map<Integer,Ronda> rondas = new HashMap<>();
        try{
            // creamos una variable de tipo Path para leer el archivo
            Path leerPartidos = Paths.get(nombreDelArchivo);           
            // Recorremos linea a linea 
            int numeroDeRonda=0;
            int golesEquipo_1=0;
            int golesEquipo_2=0;
            for(String lineaDePartidos : Files.readAllLines(leerPartidos)
                .subList(1, Files.readAllLines(leerPartidos).size())){
              
                String[]columnas=lineaDePartidos.split(";");
                //Chequeamos que sean las cantidad de Columnas correctas
                if(columnas.length!=5){
                    System.out.println("La cantidad de columnas del archivo no son las correctas");
                }
                //Chequeamos que las columnas 0, 2 y 3 sean numeros enteros
                try{
                     numeroDeRonda=Integer.valueOf(columnas[0]);
                     golesEquipo_1=Integer.valueOf(columnas[2]);
                     golesEquipo_2=Integer.valueOf(columnas[3]);
                }
                catch(NumberFormatException e){
                    
                    System.out.println("la columna de goles no son Numeros");
                    e.printStackTrace();
                }
                
                // creamos el partido
                Equipo equipo_1= new Equipo(columnas[1]);
                Equipo equipo_2= new Equipo(columnas[4]);
                Partido partido =new Partido(equipo_1,golesEquipo_1,golesEquipo_2,equipo_2,numeroDeRonda);
                //si existe la ronda la agragamos el partido sino agregamos una nueva ronda
                if (rondas.containsKey(numeroDeRonda)){
                    rondas.get(numeroDeRonda).agregarPartido(partido);
                    
                }
                else{
                    Ronda ronda=new Ronda (numeroDeRonda, partido);
                    rondas.put(numeroDeRonda,ronda);
                }
                
            }   
            
        } catch(IOException e) {
            e.printStackTrace();
        }
           return rondas;   
    } 
      public static Map<Integer,Participante> ImportarParticipantesCSV(String nombreDelArchivo, List<Partido>partidos) {
         
           //Creo el Map que va a retornar el metodo
          Map<Integer,Participante> participantes = new HashMap<>();
        try{
            // creamos una variable de tipo Path para leer el archivo
            Path leerParticipantes = Paths.get(nombreDelArchivo);           
            // Recorremos linea a linea 
            for(String lineaDeParticipantes : Files.readAllLines(leerParticipantes)
                .subList(1, Files.readAllLines(leerParticipantes).size())){
                
                Integer identificacion=1;
                int ronda=0;
                String[]columnas=lineaDeParticipantes.split(";");
                //Chequeamos que sean las cantidad de Columnas correctas
                if(columnas.length!=8){
                    System.out.println("La cantidad de columnas del archivo no son las correctas");
                }
                //Chequeamos que las columnas 0, 2 y 3 sean numeros enteros
                try{
                     identificacion=Integer.valueOf(columnas[0]);
                     ronda=Integer.valueOf(columnas[7]);
                }
                catch(NumberFormatException e){
                    
                    System.out.println("la columna de identificacion no son Numeros");
                    e.printStackTrace();
                }
                // Buscamos el Partidos
               
                Partido partido =buscarPartido(partidos,columnas[2],columnas[6],ronda);
                
                ResultadoEnum resultado=colocarResultado(columnas[3],columnas[4],columnas[5]);
                Pronostico pronostico=new Pronostico(partido,resultado);
                if (participantes.containsKey(identificacion)){
                    participantes.get(identificacion).agregarPronostico(pronostico);
                    
                }
                else{
                    Participante participante=new Participante (identificacion,columnas[1], pronostico);
                    participantes.put(identificacion,participante);
                }
                
            }   
           
            
        } catch(IOException e) {
            e.printStackTrace();
        }
            return participantes;     
    } 
      public static Partido buscarPartido(List<Partido>partidos,String nombreEquipo_1, String nombreEquipo_2, int ronda){
          Partido partidoEncontrado=partidos.stream()
                  .filter(partido -> partido.getEquipoUno().getNombre().equals(nombreEquipo_1)
                  &&partido.getEquipoDos().getNombre().equals(nombreEquipo_2)
                  &&partido.getRonda()==(ronda))
                  .findAny()
                  .orElse(null);
          return partidoEncontrado;
      }
      public static ResultadoEnum colocarResultado(String ganoEquipo_1,String empate,String ganoEquipo_2){
          if(ganoEquipo_1.equals("X")){
              return ResultadoEnum.GANA_EQUIPO_1;
          }
           if(empate.equals("X")){
              return ResultadoEnum.EMPATE;
          }
           else{
              return ResultadoEnum.GANA_EQUIPO_2;
          }
          
          
      }
      
     
}
