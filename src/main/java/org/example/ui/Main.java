package org.example.ui;

import org.example.data.GestorUnidades;

/**
 * Punto de entrada del sistema.
 * <p>
 * Ejecuta el programa y muestra en consola la información de
 * las unidades operativas creadas por {@link GestorUnidades}.
 * </p>
 */
public class Main {
    /**
     * Método principal del programa.
     * @param args argumentos de línea de comando (no utilizados).
     * */
    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("  LISTADO DE UNIDADES OPERATIVAS  ");
        System.out.println("==================================\n");

        // Crear el gestor encargado de administrar las unidades operativas.
        GestorUnidades gestor = new GestorUnidades();

        // Ejecutar la creación de unidades y mostrar sus detalles en consola.
        gestor.mostrarUnidades();
    }

}