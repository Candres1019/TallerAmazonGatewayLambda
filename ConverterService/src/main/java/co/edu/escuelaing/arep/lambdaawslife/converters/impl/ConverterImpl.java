package co.edu.escuelaing.arep.lambdaawslife.converters.impl;

import co.edu.escuelaing.arep.lambdaawslife.converters.Converter;

/**
 * Clase que implementa la conversion de grados fahrenheit a celsius y viceversa
 */
public class ConverterImpl implements Converter {

    /**
     * Método para convertir de fahrenheit a celsius
     *
     * @param degrees - grados fahrenheit
     * @return - grados celsius
     */
    @Override
    public Double fahrenheit2celsius(Double degrees) {
        double result = 0;
        result = degrees - 32;
        result *= 5;
        result /= 9;
        return result;
    }

    /**
     * Método para convertir de celsius a fahrenheit
     *
     * @param degrees - grados celsius
     * @return - grados fahrenheit
     */
    @Override
    public Double celsius2fahrenheit(Double degrees) {
        double result = degrees * 2 - degrees / 5;
        result += 32;
        return result;
    }

}
