/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

/**
 *
 * @author aleai
 */
public class Partido {
    private Equipo equipoUno;
    private Equipo equipoDos;
    private int golesEquipoUno;
    private int golesEquipoDos;
    private int ronda;
    
    public Partido(Equipo equipoUno, int golesEquipoUno, int golesEquipoDos, Equipo equipoDos, int ronda){
        this.equipoUno=equipoUno;
        this.equipoDos=equipoDos;
      //  verificarGoles(golesEquipoUno);
        //verificarGoles(golesEquipoUno);
        this.golesEquipoUno=golesEquipoUno;
        this.golesEquipoDos=golesEquipoDos;
        this.ronda=ronda;
    }

    // retona el resultado del partido
    public ResultadoEnum decirResulado(){
        
        if(golesEquipoUno>golesEquipoDos){
            return ResultadoEnum.GANA_EQUIPO_1;
        }
        if(golesEquipoUno==golesEquipoDos){
            return ResultadoEnum.EMPATE;
        }
        else{
            return ResultadoEnum.GANA_EQUIPO_2;
        }        
    }
    
    public Equipo getEquipoUno() {
        return this.equipoUno;
    }
    
     public int getRonda() {
        return this.ronda;
    }
     public void setEquipoUno(Equipo equipo) {
        this.equipoUno=equipo;
    }
    public Equipo getEquipoDos() {
        return this.equipoDos;
    }
    
    public void setEquipoDos(Equipo equipo) {
        equipoDos=equipo;
    }

    public int getGolesEquipoUno() {
        return this.golesEquipoUno;
    }

    public void setGolesEquipoUno(int golesEquipoUno) {
        this.golesEquipoUno = golesEquipoUno;
    }

    public int getGolesEquipoDos() {
        return this.golesEquipoDos;
    }

    public void setGolesEquipoDos(int golesEquipoDos) {
        this.golesEquipoDos = golesEquipoDos;
    }
    
    //Metodo Para que me devuta el array de string que necesito para 
    //guardar en el formato CSV
    public String [] formatoDeCSV(){
        String []datos={equipoUno.getNombre(),String.valueOf(golesEquipoUno),
                        String.valueOf(golesEquipoDos),equipoDos.getNombre()};
                        
        return datos;
    }
    private boolean verificarGoles(int goles){
        if(goles<0){
            System.out.println("Los Goles No puede ser numeros Negativos");
        }
        return true;
    }
    
}
