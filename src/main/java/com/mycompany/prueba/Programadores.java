/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

import java.util.ArrayList;

/**
 *
 * @author BRYAN JACHO
 */
public class Programadores extends Empleado {
    private final ArrayList<String> habilidades;


    public Programadores(String nombre, int ID, int edad, String email, String telefono) {
        super(nombre, "Programador", ID, edad, email, telefono);
        habilidades = new ArrayList<>();
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }

 
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Habilidades: " + habilidades);
    }
    @Override
     public String toString() {
        return "Programador: " + getNombre();
}
}
