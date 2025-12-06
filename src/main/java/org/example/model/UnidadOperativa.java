package org.example.model;

/**
 * Representa una unidad operativa de la empresa Salmontt.
 * Esta clase es abstracta y debe ser heredada por clases
 * concretas como {@link CentroCultivo} y {@link PlantaProceso}.
 * Contiene atributos comunes a todas las unidades como nombre y comuna.
 * <p> Las subclases deben complementar esta información  sobrescribiendo
 * el método {@code #mostrarInformacion()} e invocando {@code super.mostrarInformacion()}
 * para reutilizar los datos base.
 * </p>
 * La clase permanece {@code abstract} para eviatr que sea instanciada directamente.
 *
 * @author Monica Figueroa
 * @version 1.0
 */
public abstract class UnidadOperativa {

    /** Nombre de la unidad operativa*/
    private String nombre;

    /** Comuna donde se ubica la unidad operativa*/
    private String comuna;

    /**
     * Constructor base que analiza atributos comunes.
     * @param nombre Nombre de la unidad operativa.
     * @param comuna Comuna donde se ubica la unidad operativa.
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    // Getters se mantienen por buenas prácticas de encapsulamiento.
    /** @return nombre de la unidad operativa */
    public String getNombre() {
        return nombre;
    }

    /** @return comuna donde se ubica la unidad operativa */
    public String getComuna() {
        return comuna;
    }

    /**
     * Retorna la información base de la unidad operativa
     * en formato {@code String}.
     * Este método es reutilizado por las subclases mediante
     * {@code super.mostrarInformacion()} y agregar la información específica.
     * @return cadena con nombre y comuna de la unidad operativa.
     */
    public String mostrarInformacion(){
        return "Nombre: " + nombre + " | Comuna: " + comuna;
    }

}
