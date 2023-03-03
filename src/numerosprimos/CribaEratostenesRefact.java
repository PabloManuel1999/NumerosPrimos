/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosprimos;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
class CribaEratostenesRefact {
    
    public static int[] generarPrimosRefact(int max){
     
        // Para saltarnos el programa en caso de que max sea < 2 usamos este if
        // y nos ahorramos el else del final.
        if (max < 2) {
            return new int[0]; 
        }
        
        // La declaración del tamaño del array se hace en una sola linea.       
        boolean[] esPrimo = new boolean[max + 1]; 
        
        // Con la sentencia Arrays.fill nos saltamos el paso del bucle for e inicializamos 
        // el array a true.        
        Arrays.fill(esPrimo, true); 
        
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false;
        
        // Se cambia el bucle for que elimina los múltiplos de i para que comienze en i*i 
        // y cualquier múltiplo menor se eliminará por un número anterior ' * '.       
        for (int i = 2; i < Math.sqrt(max + 1); i++) { 
            if (esPrimo[i]) {
                // *
                for (int j = 2 * i; j < max + 1; j += i) { 
                    esPrimo[j] = false; 
                } 
            }
        }
        
        // Contamos los primos que hay usando directamente la variable esPrimo
        // donde ya estan añadidos.
        int numPrimos = 0; 
        for (boolean b : esPrimo) { 
            if (b) 
                numPrimos++; 
            }
        
        // Cambiamos la variable j que esta dentro del bucle y la ponemos fuera.       
        int[] primos = new int[numPrimos]; 
        int j = 0;
        for (int i = 0; i < max + 1; i++) { 
            if (esPrimo[i]) {
                primos[j++] = i;       
            }
        } 
        // Eliminar el 0 y el 1, que no son primos
        esPrimo[0] = esPrimo[1] = false; 
        return primos; 
    }    
}
