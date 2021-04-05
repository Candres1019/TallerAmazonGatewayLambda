import co.edu.escuelaing.arep.lambdaawslife.converters.impl.ConverterImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldAnswer0Celcius() {
        ConverterImpl converter = new ConverterImpl();
        double result = converter.fahrenheit2celsius(32d);
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void shouldAnswer1Celcius() {
        ConverterImpl converter = new ConverterImpl();
        double result = converter.fahrenheit2celsius(33.8);
        assertEquals(1.0, result, 1);
    }

    @Test
    public void shouldAnswer0Fahrenheit() {
        ConverterImpl converter = new ConverterImpl();
        double result = converter.celsius2fahrenheit(-17.7778);
        assertEquals(0.0, result, 1);
    }

    @Test
    public void shouldAnswer1Fahrenheit() {
        ConverterImpl converter = new ConverterImpl();
        double result = converter.celsius2fahrenheit(-17.2222);
        assertEquals(1.0, result, 1);
    }

}
