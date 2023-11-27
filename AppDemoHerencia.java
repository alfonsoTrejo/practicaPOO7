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
public class AppDemoHerencia {
    public void main(){
    Sensor sensor = new Sensor("capacitivo", "unidad", 0, "samsung", "0x443", "Samsnug", "32x1");
        Pantalla pantalla = new Pantalla(450,450, "nexpn", "0x3321", "nextPn", "pantalla");
        Microprocesador cpu = new Microprocesador(5000, 16000000, "avr", "0x3321", "atmega", "atmega328p");
        Smartphone telefono1 = new Smartphone(sensor, pantalla, cpu, 0, true, "samsung", "0xffr", "samsung", "a51");
        Smartphone telefono2 = new Smartphone(sensor, pantalla, cpu, 0, true, "samsung", "0xffr", "samsung", "a51");
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        listaDeSmartphones.add(telefono1);
        listaDeSmartphones.add(telefono2);
        for (int i = 0; i < listaDeSmartphones.size(); i++) {
            System.out.println(listaDeSmartphones.get(i).toString());    
        }
        
        ArrayList<Television > listaDeTVs = new ArrayList<>();
        Television tv1 = new Television(pantalla, true, "TLC", "0xfff", "TLC", "TEle");
        Television tv2 = new Television(pantalla, true, "samsung", "0xfff", "TLC", "TEle");
        listaDeTVs.add(tv1);
        listaDeTVs.add(tv2);
        for (int i = 0; i < listaDeTVs.size(); i++) {
            System.out.println(listaDeTVs.get(i).toString());    
        }    
    }    
}
