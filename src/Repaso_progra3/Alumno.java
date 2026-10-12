/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repaso_progra3;

/**
 *
 * @author puma_
 */
public class Alumno extends Usuario{
    //Atributos propios
    private String carrera;
    private String semestre;
    
    public Alumno(int id_local, String nombre_local, String apellido_local) {
        super(id_local, nombre_local, apellido_local);
        
        this.carrera = carrera;
        this.semestre = carrera; 
    }
    //Getters y Setters

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public void estudiar(){
        System.out.println(nombre + "esta estudiando");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }
    
}
