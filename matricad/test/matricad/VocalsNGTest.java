/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package matricad;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alumno
 */
public class VocalsNGTest {
    
    public VocalsNGTest() {
    }

    /**
     * Test of esVocal method, of class Vocals.
     */
    @Test
    public void testEsVocal() {
        System.out.println("esVocal");
        String lletra = "a";
        Vocals instance = new Vocals();
        boolean expResult = true;
        boolean result = instance.esVocal(lletra);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void esNull(){
        Vocals crea1 = new Vocals();
        crea1.esVocal("");
    }
    @Test
    public void esMayuscula(){
        Vocals crea1 = new Vocals();
        crea1.esVocal("A");
    }
    @Test
    public void esCadena(){
        Vocals crea1 = new Vocals();
        crea1.esVocal("aaaa");
    }
    @Test
    public void esConAcento(){
        Vocals crea1 = new Vocals();
        crea1.esVocal("á");
    }
    @Test
    public void esCaracterEspecial(){
        Vocals crea1 = new Vocals();
        crea1.esVocal(" ");
    }
    
}
