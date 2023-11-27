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
public class Microprocesador extends ComponenteElectronico{
    private int cacheRAM;
    private long velocidadHz;

    public Microprocesador(int cacheRAM, long velocidadHz, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public Microprocesador(int cacheRAM, long velocidadHz, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public Microprocesador(int cacheRAM, long velocidadHz, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, componentes);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public Microprocesador(int cacheRAM, long velocidadHz, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.cacheRAM = cacheRAM;
        this.velocidadHz = velocidadHz;
    }

    public int getCacheRAM() {
        return cacheRAM;
    }

    public long getVelocidadHz() {
        return velocidadHz;
    }

    @Override
    public String toString() {
        return "Microprocesador{" + "cacheRAM=" + cacheRAM + ", velocidadHz=" + velocidadHz + '}';
    }
    
    
}
