/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica7;

import java.awt.Canvas;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author trejo
 */
public class Practica7  extends Canvas{

    public static void main(String[] args) {
        Canvas canvas= new Canvas();
       JFrame frame = new JFrame();
       frame.setSize(300, 300);
       Microprocesador cpu = new Microprocesador(5000, 16000000, "avr", "0x3321", "atmega", "atmega328p");
       Computadora compu = new Computadora(cpu, 5000, true, "lenovo", "310x", "lenovo", "thikpad");
       
       UIComputadora c = new UIComputadora(compu);
       UIMicroprocesador m = new UIMicroprocesador(cpu);
       m.main(frame);
       c.main(frame);
    }
}
