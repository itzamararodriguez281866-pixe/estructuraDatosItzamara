/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Listas;

/**
 *
 * @author puma_
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaEnlazada listaAlumnos = new ListaEnlazada();
        
        String nodoJuanito = "Juanito";
        String nodoMaria = "Maria";
        String nodoLupita = "Lupita";
        String nodoCarlos = "Carlos";
        
        listaAlumnos.agregarInicio(nodoJuanito);
        listaAlumnos.agregarInicio(nodoMaria);
        listaAlumnos.agregarFinal(nodoLupita);
        listaAlumnos.agregarFinal(nodoCarlos);
        
        
        System.out.println("tamaño: " + listaAlumnos.cantidadNodos());        
        listaAlumnos.mostrarLista();
    }
    
}
