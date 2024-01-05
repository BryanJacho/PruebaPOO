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
public class Gerentes extends Empleado {
    private final ArrayList<Empleado> empleadosACargo;


    public Gerentes(String nombre, int ID, int edad, String email, String telefono) {
        super(nombre, "Gerente", ID, edad, email, telefono);
        empleadosACargo = new ArrayList<>();
    }

  
    public ArrayList<Empleado> getEmpleadosACargo() {
        return empleadosACargo;
    }

    public void agregarEmpleadoACargo(Empleado empleado) {
        empleadosACargo.add(empleado);
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados a Cargo: " + empleadosACargo);
    }
}

    
    