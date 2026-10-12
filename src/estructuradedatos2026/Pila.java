/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuradedatos2026;

import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author puma_
 */
public class Pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Deque pila0 = new ArrayDeque(); //pila de objetos Object
        Deque<String> pila = new ArrayDeque<>(); //pila de String
        
        //pussh: apilar elementos
        pila.push("Fresa");
        pila.push("Mango");
        pila.push("Manzana");
        pila.push("Mango");
        pila.push("Ciruela");
        pila.push("Tamarindo"); 
       //peek: ver la cima sin retirarlo
        System.out.println("Cima: " + pila.peek());
        //pop: Desapilar
        System.out.println("Retirado: " + pila.pop());
        System.out.println("Nueva cima: " + pila.peek());
        
        System.out.println("-----Hay " + pila.size() + " frutas en la pila -----");
        while(!pila.isEmpty()){ //!pila.isEmpty() = true
            System.out.println("Procesado: " + pila.pop());
            
        }
      
   }
    
}
