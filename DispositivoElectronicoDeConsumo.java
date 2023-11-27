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
public class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    private boolean encendido;

    public DispositivoElectronicoDeConsumo(boolean encendido, String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
        this.encendido = encendido;
    }

    public DispositivoElectronicoDeConsumo(boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = encendido;
    }

    public DispositivoElectronicoDeConsumo(boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, componentes);
        this.encendido = encendido;
    }

    public DispositivoElectronicoDeConsumo(boolean encendido, String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.encendido = encendido;
    }
    
    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
        this.encendido = false;
    }
    public void encerder(){
        encendido = true;
    }
    public void apagar(){
        encendido= false;
    }
    public boolean isEncendido(){
        return encendido;
    }

    @Override
    public String toString() {
        return "DispositivoElectronicoDeConsumo{" + "encendido=" + encendido + '}';
    }
    
}
