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
public class ComponenteElectronico extends DispositivoElectronico{

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
        super(fabricante, numeroSerie, marca, nombre);
    }

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        super(fabricante, numeroSerie, marca, nombre, costo);
    }

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, componentes);
    }

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo, ArrayList componentes) {
        super(fabricante, numeroSerie, marca, nombre, costo, componentes);
    }
    
}