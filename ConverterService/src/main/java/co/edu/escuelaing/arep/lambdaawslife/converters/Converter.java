package co.edu.escuelaing.arep.lambdaawslife.converters;

/**
 * Interfaz para la conversion de grados fahrenheit a celsius y viceversa
 */
public interface Converter {

    /**
     * Método para convertir de fahrenheit a celsius
     *
     * @param degrees - grados fahrenheit
     * @return - grados celsius
     */
    Double fahrenheit2celsius(Double degrees);

    /**
     * Método para convertir de celsius a fahrenheit
     *
     * @param degrees - grados celsius
     * @return - grados fahrenheit
     */
    Double celsius2fahrenheit(Double degrees);

}
