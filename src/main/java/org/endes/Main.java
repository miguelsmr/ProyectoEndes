package org.endes;

import entities.Persona;

/**
 * Clase principal para probar la clase Persona.
 */
public class Main {

    public static void main(String[] args) {

        // ====== 1. Probar métodos static ======
        String dniPrueba = "12345678A";
        System.out.println("¿DNI válido? " + Persona.validarDni(dniPrueba));
        System.out.println("IMC (static): " + Persona.calcularIMC(70, 1.75));
        System.out.println();

        // ====== 2. Constructor por defecto + setters ======
        Persona p1 = new Persona();
        p1.setNombre("Miguel");
        p1.setApellidos("García López");
        p1.setEdad(20);
        p1.setDni(dniPrueba);
        p1.setAltura(1.75);
        p1.setPeso(70);
        p1.setTelefono("600000000");
        p1.setEmail("miguel@email.com");

        // Uso real de getters
        System.out.println("Nombre (getter): " + p1.getNombre());
        System.out.println("Edad (getter): " + p1.getEdad());
        System.out.println();

        System.out.println("=== Persona 1 ===");
        p1.mostrarInformacion();
        System.out.println("Mayor de edad: " + p1.esMayorDeEdad());
        System.out.println();

        // ====== 3. Constructor completo ======
        Persona p2 = new Persona(
                "Laura",
                "Martínez Ruiz",
                17,
                "87654321B",
                1.60,
                55,
                "700000000",
                "laura@email.com"
        );

        System.out.println("=== Persona 2 ===");
        p2.mostrarInformacion();
        System.out.println("Mayor de edad: " + p2.esMayorDeEdad());
    }
}
