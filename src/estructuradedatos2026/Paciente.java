/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos2026;

/**
 *
 * @author puma_
 */
public class Paciente {
    private int numeroSeguroSocial;
    private String nombreCompleto;
    private byte edad;
    private char sexoBiologico;
    private double glucosa;
    private int globulosRojos;
    private double temperaturaCorporal;
    private double dosisMedicamentoMl;
    private boolean esAlergicoPenicilina;

    public int getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(int numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public char getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(char sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public double getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(double glucosa) {
        this.glucosa = glucosa;
    }

    public int getGlobulosRojos() {
        return globulosRojos;
    }

    public void setGlobulosRojos(int globulosRojos) {
        this.globulosRojos = globulosRojos;
    }

    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(double temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public double getDosisMedicamentoMl() {
        return dosisMedicamentoMl;
    }

    public void setDosisMedicamentoMl(double dosisMedicamentoMl) {
        this.dosisMedicamentoMl = dosisMedicamentoMl;
    }

    public boolean isEsAlergicoPenicilina() {
        return esAlergicoPenicilina;
    }

    public void setEsAlergicoPenicilina(boolean esAlergicoPenicilina) {
        this.esAlergicoPenicilina = esAlergicoPenicilina;
    }
    
}
