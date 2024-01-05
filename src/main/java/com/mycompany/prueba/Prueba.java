/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author BRYAN JACHO
 */
public class Prueba {
    public static void main(String[] args) {
        // Crear un programador
        Programadores programador = new Programadores("Bryan", 001, 20, "lex_2@email.com", "0987923523");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("C++");

        
        IlustradoresGraficos ilustrador = new IlustradoresGraficos("Alvarez", 002, 23, "alev@email.com", "0986546221");
        ilustrador.agregarHabilidad("Diseño digital");
        ilustrador.agregarHabilidad("Ilustración tradicional");

        
        Gerentes gerente = new Gerentes("Lucia", 003, 41, "luci@email.com", "0991123344");
        gerente.agregarEmpleadoACargo(programador);
        gerente.agregarEmpleadoACargo(ilustrador);

        Editores editor = new Editores("lucas", 004, 19, "luca@email.com", "09754312223", true);

     
        System.out.println("Información del Programadores:");
        programador.mostrarInformacion();

        System.out.println("\nInformación del Ilustradores Gráficos:");
        ilustrador.mostrarInformacion();

        System.out.println("\nInformación del Gerentes:");
        gerente.mostrarInformacion();

        System.out.println("\nInformación del Editores:");
        editor.mostrarInformacion();
    }
}
