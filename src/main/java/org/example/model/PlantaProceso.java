package org.example.model;

/**
 * Clase {@code PlantaProceso} representa una planta de proceso de salmones
 * en el sistema {@code SalmonttAppSemana7}.
 * <p>
 * Hereda de {@link UnidadOperativa} y agrega la capacidad anual de procesamiento.
 * </p>
 *
 * @author Monica Figueroa
 * @version 1.0
 */
public class PlantaProceso extends UnidadOperativa{

    /** Capacidad anual estimada en toneladas*/
    private double capacidadAnualToneladas;

    /**
     * Constructor de la planta de proceso.
     *
     * @param nombre Nombre de la planta.
     * @param comuna Comuna donde se ubica la planta.
     * @param capacidadAnualToneladas Capacidad de proceso anual
     * en toneladas.
     */
    public PlantaProceso(String nombre, String comuna, double capacidadAnualToneladas) {

        // Llamada al constructor de la superclase para inicializar nombre y comuna.
        super(nombre, comuna);
        this.capacidadAnualToneladas = capacidadAnualToneladas;
    }

    /**
     * Reutiliza {@code super.mostrarInformacion()} para los datos comunes.
     * @return información completa de la planta de proceso.
     */
    @Override
    public String mostrarInformacion() {
        return "=== PLANTA DE PROCESO ===\n" + super.mostrarInformacion() +
                " | Capacidad Anual: " + capacidadAnualToneladas + " t/anio\n";
    }
}

