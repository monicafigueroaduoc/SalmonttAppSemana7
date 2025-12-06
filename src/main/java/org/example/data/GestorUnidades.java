package org.example.data;

import org.example.model.CentroCultivo;
import org.example.model.PlantaProceso;
import org.example.model.UnidadOperativa;
import java.util.ArrayList;
import java.util.List;

/**
 * Crea y administra unidades operativas utilizando herencia simple
 * y polimorfismo.
 * <p>
 * Crea una colección de tipo {@link List} que almacena objetos de
 * la clase {@link UnidadOperativa}, incluyendo instancias de:
 * {@link CentroCultivo} y {@link PlantaProceso}.
 * </p>
 */
public class GestorUnidades {

    /**
     * Crea y retorna una lista de unidades operativas.
     * <p> Se crean 5 unidades, combinando centros de
     * cultivo y plantas de proceso, demostrando el
     * uso de polimorfismo.
     * </p>
     *
     * @return lista de unidades operativas.
     */
    public List<UnidadOperativa> crearUnidades() {
        List<UnidadOperativa> unidades = new ArrayList<>();

        // Instanciación de centros de cultivo utilizando polimorfismo.
        unidades.add(new CentroCultivo("Centro AquaChile",
                "Quellon", 200000.0));
        unidades.add(new CentroCultivo("Centro Salmones Austral",
                "Calbuco", 60000.0));
        unidades.add(new CentroCultivo("Centro Blumar",
                "Puerto Montt", 85000.0));

        // Instanciación de  plantas de proceso utilizando la misma referencia padre.
        unidades.add(new PlantaProceso("Planta Camanchaca",
                "Calbuco", 140000.0));
        unidades.add(new PlantaProceso("Planta AquaChile",
                "Quellón", 110000.0));

        return unidades;
    }

    /** Recorre la lista de unidades operativas y muestra su información
     * en consola utilizando polimorfismo.
     * <p> Cada objeto ejecuta su propia versión del método {@code mostrarInformacion()}
     * según su tipo.</p>
     */
    public void mostrarUnidades() {
        // Se obtiene la lista de unidades operativas (centros y plantas).
        List<UnidadOperativa> unidades = crearUnidades();
        // Se recorre la lista usando un ciclo for-each.
        for (UnidadOperativa unidad : unidades) {
            // Se ejecuta el metodo mostrarInformacion() según el tipo real del objeto.
            System.out.println(unidad.mostrarInformacion()); //Poliforfismo.
        }
    }
}



