/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_progra3;

/**
 *
 * @author puma_
 */
public class Profesor extends Usuario{
    
    //Atributos propios
    private String numeroEmpleado;
    private String departamento;
    
    public Profesor(int id_local, String nombre_local, String apellido_local) {
        super(id_local, nombre_local, apellido_local);
        
        this.numeroEmpleado = numeroEmpleado;
        this.departamento = departamento;
       
    }
    //Getters y Setters

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    // Metodo propio de Profesor
    public void impartirClase(){
        System.out.println(getNombre() + "trabaja en el departamento de " + departamento + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
    }
    
    
}
