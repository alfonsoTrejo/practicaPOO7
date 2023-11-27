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
public class Television extends DispositivoElectronicoDeConsumo {
    private Pantalla pantalla;

    public Television(Pantalla pantalla, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre) {
        super(encendido, fabricante, numeroSerie, marca, nombre);
        this.pantalla = pantalla;
    }

    public Television(Pantalla pantalla, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo);
        this.pantalla = pantalla;
    }

    public Television(Pantalla pantalla, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(encendido, fabricante, numeroSerie, marca, nombre, componentes);
        this.pantalla = pantalla;
    }

    public Television(Pantalla pantalla, boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(encendido, fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.pantalla = pantalla;
    }

    public Television(Pantalla pantalla, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.pantalla = pantalla;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    @Override
    public String toString() {
        return "Television{" + "pantalla=" + pantalla + '}'+'\n'+super.toString();
    }
    
    
}
