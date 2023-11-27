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
public class Smartphone extends Computadora{
    private Sensor sensor;
    private Pantalla pantalla;

    public Smartphone(Sensor sensor, Pantalla pantalla, Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre) {
        super(cpu, ramMB, encendido, fabricante, numeroSerie, marca, nombre);
        this.sensor = sensor;
        this.pantalla = pantalla;
    }

    public Smartphone(Sensor sensor, Pantalla pantalla, Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(cpu, ramMB, encendido, fabricante, numeroSerie, marca, nombre, costo);
        this.sensor = sensor;
        this.pantalla = pantalla;
    }

    public Smartphone(Sensor sensor, Pantalla pantalla, Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(cpu, ramMB, encendido, fabricante, numeroSerie, marca, nombre, componentes);
        this.sensor = sensor;
        this.pantalla = pantalla;
    }

    public Smartphone(Sensor sensor, Pantalla pantalla, Microprocesador cpu, long ramMB, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(cpu, ramMB, encendido, fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.sensor = sensor;
        this.pantalla = pantalla;
    }

    public Smartphone(Sensor sensor, Pantalla pantalla, Microprocesador cpu, long ramMB, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(cpu, ramMB, fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.sensor = sensor;
        this.pantalla = pantalla;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "sensor=" + sensor + ", pantalla=" + pantalla + '}'+'\n'+super.toString();
    }
    
    
}
