/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_progra3;

/**
 *
 * @author puma_
 */
public class Usuario {
    //atributos
    public int id;
    public String nombre;
    public String apellido;
    
    //Constructor

    public Usuario(int id_local, String nombre_local, String apellido_local) {
        this.id = id_local;
        this.nombre = nombre_local;
        this.apellido = apellido_local;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    //métod para imprimir o mostrar información
    public void mostrarInformacion(){
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
}
