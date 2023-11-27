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
public class Pantalla extends ComponenteElectronico{
    private int resolucionX;
    private int resolucionY;

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, componentes);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public Pantalla(int resolucionX, int resolucionY, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.resolucionX = resolucionX;
        this.resolucionY = resolucionY;
    }

    public int getResolucionX() {
        return resolucionX;
    }

    public int getResolucionY() {
        return resolucionY;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "resolucionX=" + resolucionX + ", resolucionY=" + resolucionY + '}';
    }

}