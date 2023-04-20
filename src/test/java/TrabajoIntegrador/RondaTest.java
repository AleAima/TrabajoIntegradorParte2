/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TrabajoIntegrador;

import com.mycompany.trabajointegradorjava.Equipo;
import com.mycompany.trabajointegradorjava.Partido;
import com.mycompany.trabajointegradorjava.Ronda;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleai
 */
public class RondaTest {
    

    /**
     * Test of agregarPartido method, of class Ronda.
     */
    @Test
    public void testAgregarPartido() {
        System.out.println("Test agregarPartido");
        Ronda ronda = new Ronda (1);
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
       
        ronda.agregarPartido(partido);
        
        assertEquals(ronda.getPartidos().get(0),partido);
        
    }

    /**
     * Test of existePartido method, of class Ronda.
     */
    @Test
    public void testExistePartido() {
        System.out.println(" Test existePartido");
       Ronda ronda = new Ronda (1);
       Equipo equipo_1=new Equipo("Argentina");
       Equipo equipo_2=new Equipo("Brazil");
       Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
       
       ronda.agregarPartido(partido);
       
       assertTrue(ronda.existePartido(partido));      
    }
    
}
