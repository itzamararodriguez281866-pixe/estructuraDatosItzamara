/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

import java.util.ArrayList;

/**
 *
 * @author puma_
 */
public class ListaFrutas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList();  
        
        //add()
        lista.add("Manzana");
        lista.add("Mango");
        lista.add("Durazno");
        lista.add(0,"Pera");
        
        //get para obtener un elemento segun su indice
        System.out.println("fruta: "+lista.get(2));
        //set() cambiar valor de un elemento
        lista.set(1, "Mango manila");
        
        //remove quit elementos por indice o por objeto
        lista.remove(3);
        lista.remove("Pera");
        System.out.println(lista);
        
        if(lista.contains("Fresa")){
            System.out.println("si hay fresa");
       }else{
            System.out.println("No hay fresa");
        }
        
        System.out.println("Hay "+ lista.size()+ "frutas");
        System.out.println(lista.isEmpty());
        
        //for each 
        for(String fruta: lista){
            System.out.println(fruta);       
        }
        
        //for each moderno
        lista.forEach( (f)->{System.out.println(f);});
        
        //si ocupas el indice
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        //clear()
        //lista.clear
        
        System.out.println(lista);
    }
    
}
