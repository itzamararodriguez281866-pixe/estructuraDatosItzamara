/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos2026;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author puma_
 */
public class Mifila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue <String> colaOXXO = new LinkedList<>();
        
        colaOXXO.offer("Maria");
        colaOXXO.offer("Pepe");
        colaOXXO.offer("Juan");
        colaOXXO.offer("Ana");
        colaOXXO.offer("Carlos");
        
        System.out.println("Sigueinte: ");
        System.out.println(colaOXXO.peek());
        
        System.out.println("Atendido: ");
        System.out.println(colaOXXO.poll());
        
        System.out.println("Quedan: ");
        System.out.println(colaOXXO.size());
        
        System.out.println("\nEsta vacia?: " + colaOXXO.isEmpty());
        System.out.println(colaOXXO);
    }
    
}
