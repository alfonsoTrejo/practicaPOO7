/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica7;

import java.util.ArrayList;

/**
 *
 * @author trejo
 */
public class Computadora extends DispositivoElectronicoDeConsumo{
    private Microprocesador cpu;
    private long ramMB;

    public Computadora(Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre) {
        super(encendido, fabricante, numeroSerie, marca, nombre);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Computadora(Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Computadora(Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(encendido, fabricante, numeroSerie, marca, nombre, componentes);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Computadora(Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Computadora(Microprocesador cpu, long ramMB, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Microprocesador getCpu() {
        return cpu;
    }

    public void setCpu(Microprocesador cpu) {
        this.cpu = cpu;
    }

    public long getRamMB() {
        return ramMB;
    }

    public void setRamMB(long ramMB) {
        this.ramMB = ramMB;
    }

    @Override
    public String toString() {
        return "Computadora{" + "cpu=" + cpu + ", ramMB=" + ramMB + '}';
    }
    
}
