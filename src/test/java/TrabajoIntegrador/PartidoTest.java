/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package TrabajoIntegrador;

import com.mycompany.trabajointegradorjava.Equipo;
import com.mycompany.trabajointegradorjava.Partido;
import com.mycompany.trabajointegradorjava.ResultadoEnum;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleai
 */
public class PartidoTest {
    
    public PartidoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void resultadoEmpate() {
        
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,4,equipo_2,1);
        
        assertEquals(partido.decirResulado(),ResultadoEnum.EMPATE);
        
     }
     
    @Test
    public void resultadoGanaEquipo_1() {
        
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,4,0,equipo_2,1);
        
        assertEquals(partido.decirResulado(),ResultadoEnum.GANA_EQUIPO_1);
        
     }
     
    @Test
    public void resultadoGanaEquipo_2() {
        
        Equipo equipo_1=new Equipo("Argentina");
        Equipo equipo_2=new Equipo("Brazil");
        Partido partido=new Partido(equipo_1,0,2,equipo_2,1);
        
        assertEquals(partido.decirResulado(),ResultadoEnum.GANA_EQUIPO_2);
        
     }
}
