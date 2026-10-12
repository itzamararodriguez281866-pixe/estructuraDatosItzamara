/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuradedatos2026;

/**
 *
 * @author puma_
 */
public class BoletoAvion {
    private short numeroTicket;
    private int codigoReserva;
    private byte asientoFila;
    private char asientoLetra;
    private double distanciaKm;
    private double altitud;
    private float pesoEquipajeKg;  
    private double precioBoleto;
    private boolean incluyeEquipajeMano;

    public short getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(short numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public int getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(int codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public byte getAsientoFila() {
        return asientoFila;
    }

    public void setAsientoFila(byte asientoFila) {
        this.asientoFila = asientoFila;
    }

    public char getAsientoLetra() {
        return asientoLetra;
    }

    public void setAsientoLetra(char asientoLetra) {
        this.asientoLetra = asientoLetra;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public float getPesoEquipajeKg() {
        return pesoEquipajeKg;
    }

    public void setPesoEquipajeKg(float pesoEquipajeKg) {
        this.pesoEquipajeKg = pesoEquipajeKg;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }

    public boolean isIncluyeEquipajeMano() {
        return incluyeEquipajeMano;
    }

    public void setIncluyeEquipajeMano(boolean incluyeEquipajeMano) {
        this.incluyeEquipajeMano = incluyeEquipajeMano;
    }
    
    
    
}
