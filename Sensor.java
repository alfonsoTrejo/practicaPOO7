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
public class Sensor extends ComponenteElectronico{
    private String tipo;
    private String unidadDeMedida;
    private int valor;

    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, componentes);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public Sensor(String tipo, String unidadDeMedida, int valor, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.tipo = tipo;
        this.unidadDeMedida = unidadDeMedida;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Sensor{" + "tipo=" + tipo + ", unidadDeMedida=" + unidadDeMedida + ", valor=" + valor + '}';
    }
    
}
