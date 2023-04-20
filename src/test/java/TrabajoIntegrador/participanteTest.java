/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TrabajoIntegrador;

import com.mycompany.trabajointegradorjava.Equipo;
import com.mycompany.trabajointegradorjava.Participante;
import com.mycompany.trabajointegradorjava.Partido;
import com.mycompany.trabajointegradorjava.Pronostico;
import com.mycompany.trabajointegradorjava.ResultadoEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleai
 */
public class participanteTest {
    
     @Test
     public void agregarPronosticoAlParticipante() {
     
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        Pronostico pronostico= new Pronostico(partido,ResultadoEnum.EMPATE);
        Participante participante = new Participante (1,"Alejandro"); 
        
        participante.agregarPronostico(pronostico);
        
        assertEquals(participante.getPronosticos().get(0),pronostico);
     }
     
     @Test
     public void noExisteElPronostico() {
     
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        Pronostico pronostico= new Pronostico(partido,ResultadoEnum.EMPATE);
        Participante participante = new Participante (1,"Alejandro"); 
        Pronostico noExistePronostico= new Pronostico(partido,ResultadoEnum.GANA_EQUIPO_1);
        participante.agregarPronostico(pronostico);
        
        assertFalse(participante.existeElPronsotico(noExistePronostico));
     }
     
        @Test
        public void ExisteElPronostico() {
     
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        Pronostico pronostico= new Pronostico(partido,ResultadoEnum.EMPATE);
        Participante participante = new Participante (1,"Alejandro"); 
        participante.agregarPronostico(pronostico);
        
        assertTrue(participante.existeElPronsotico(pronostico));
     }
     
    
    
}
