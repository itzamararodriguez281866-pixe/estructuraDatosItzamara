/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

/**
 *
 * @author puma_
 */
public class Nodo {
 String valor;
 Nodo siguiente;

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Nodo(String valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }
 
 
}
