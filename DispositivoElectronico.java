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
    public class DispositivoElectronico {
        private String fabricante;
        private String numeroSerie;
        private String marca;
        private String nombre; 
        private float costo;
        private ArrayList<ComponenteElectronico> componentes;

        public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre) {
            this.fabricante = fabricante;
            this.numeroSerie = numeroSerie;
            this.marca = marca;
            this.nombre = nombre;
            componentes = new ArrayList<>();
        }

        public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
            this.fabricante = fabricante;
            this.numeroSerie = numeroSerie;
            this.marca = marca;
            this.nombre = nombre;
            componentes = new ArrayList<>();
            this.costo =costo;
        }

        public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, ArrayList componentes) {
            this.fabricante = fabricante;
            this.numeroSerie = numeroSerie;
            this.marca = marca;
            this.nombre = nombre;
            this.componentes = componentes; 
            this.costo =300;
        }

        public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre,float costo, ArrayList componentes) {
            this.fabricante = fabricante;
            this.numeroSerie = numeroSerie;
            this.marca = marca;
            this.nombre = nombre;
            this.componentes = componentes; 
            this.costo =costo;
        }

        public void cambiarCosto(float costo){
            this.costo = costo;
        }

        public  void agregarComponente(ComponenteElectronico componente){
            componentes.add(componente);
        }

        public  void quitarComponente(ComponenteElectronico componente){
            componentes.remove(componente);
        }

    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "fabricante=" + fabricante + ", numeroSerie=" + numeroSerie + ", marca=" + marca + ", nombre=" + nombre + ", costo=" + costo + ", componentes=" + componentes + '}';
    }
        
    }
