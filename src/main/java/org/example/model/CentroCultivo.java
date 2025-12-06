package org.example.model;

/**
 * Clase {@code CentroCultivo} representa un Centro de cultivo de salmones
 * en el sistema {@code SalmonttAppSemana7}.
 * <p>
 *  Hereda de {@link UnidadOperativa} y agrega la información relacionada con la producción anual en toneladas.
 * </p>
 *
 *  @author Monica Figueroa
 *  @version 1.0
 */
public class CentroCultivo extends UnidadOperativa{

    /** Producción anual en toneladas. */
    private double produccionAnualToneladas;

    /**
     * Constructor de la clase CentroCultivo.
     *
     * @param nombre Nombre del centro.
     * @param comuna Comuna donde se ubica el centro.
     * @param produccionAnualToneladas Produccion anual en toneladas.
     */
    public CentroCultivo(String nombre, String comuna, double produccionAnualToneladas) {

        // Llamada al constructor de la superclase para inicializar nombre y comuna.
        super(nombre, comuna);
        this.produccionAnualToneladas = produccionAnualToneladas;
    }

    /**
     * Reutiliza {@code super.mostrarInformacion()} para los datos comunes.
     * @return información completa del Centro de Cultivo.
     */
    @Override
    public String mostrarInformacion() {
        return "=== CENTRO DE CULTIVO ===\n" + super.mostrarInformacion() +
                " | Produccion anual: "
                + produccionAnualToneladas + " t/anio\n";
    }
}

