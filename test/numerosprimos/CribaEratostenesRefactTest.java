/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimos;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class CribaEratostenesRefactTest {
    
    @Test
    public void testGenerarPrimosRefact1() {
        System.out.println("generarPrimos1");
        int max = 0;
        int[] expResult = {};
        int[] result = CribaEratostenesRefact.generarPrimosRefact(max);
        assertArrayEquals(expResult, result);
        System.out.println("El resultado 1 coincide con el resultado esperado");
    }
    @Test
    public void testGenerarPrimosRefact2() {
        System.out.println("generarPrimos2");
        int max = 2;
        int[] expResult = {2};
        int[] result = CribaEratostenesRefact.generarPrimosRefact(max);
        assertArrayEquals(expResult, result);
        System.out.println("El resultado 2 coincide con el resultado esperado");
    }
    @Test
    public void testGenerarPrimosRefact3() {
        System.out.println("generarPrimos3");
        int max = 3;
        int[] expResult = {2, 3};
        int[] result = CribaEratostenesRefact.generarPrimosRefact(max);
        assertArrayEquals(expResult, result);
        System.out.println("El resultado 3 coincide con el resultado esperado");
    }
    @Test
    public void testGenerarPrimosRefact4() {
        System.out.println("generarPrimos4");
        int max = 100;
        int[] expResult = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 
                            47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int[] result = CribaEratostenesRefact.generarPrimosRefact(max);
        assertArrayEquals(expResult, result);
        System.out.println("El resultado 4 coincide con el resultado esperado");
    }
    
}
