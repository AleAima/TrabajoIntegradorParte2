/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TrabajoIntegrador;

import com.mycompany.trabajointegradorjava.Equipo;
import com.mycompany.trabajointegradorjava.Partido;
import com.mycompany.trabajointegradorjava.Pronostico;
import com.mycompany.trabajointegradorjava.ResultadoEnum;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleai
 */
public class PronosticoTest {
    

    /**
     * Test of getResultado method, of class Pronostico.
     */
    @Test
    public void testGetResultado() {
        System.out.println(" Test getResultado");
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        
        Pronostico pronostico= new Pronostico(partido,ResultadoEnum.EMPATE);
        
        assertEquals(pronostico.getResultado(), ResultadoEnum.EMPATE);
    }
  
    /**
     * Test of decirPuntajeDelPronostico method, of class Pronostico.
     */
    @Test
    public void testDecirPuntajeDelPronostico() {
        System.out.println(" Test decirPuntajeDelPronostico");
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        
        Pronostico pronostico= new Pronostico(partido,ResultadoEnum.EMPATE);
        
        assertEquals(pronostico.decirPuntajeDelPronostico(), 1);
    }

    
}
