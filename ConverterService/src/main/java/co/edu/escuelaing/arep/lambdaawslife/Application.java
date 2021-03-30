package co.edu.escuelaing.arep.lambdaawslife;

import co.edu.escuelaing.arep.lambdaawslife.converters.Converter;
import co.edu.escuelaing.arep.lambdaawslife.converters.impl.ConverterImpl;
import com.google.gson.Gson;

import static spark.Spark.*;

/**
 * Clase Application, encargada de funcionar como API para conversion de grados fahrenheit a celsius y viceversa.
 */
public class Application {

    /**
     * Método principal de la clase Application
     *
     * @param args - args
     */
    public static void main(String[] args) {
        port(getPort());
        init();
        get("/convert/fahrenheit/celsius", (request, response) ->{
            response.type("application/json");
            double degrees;
            try {
                degrees = Double.parseDouble(request.queryParams("value"));
            } catch (Exception e) {
                return new Gson().toJson("{\"Error\": \"" + "Valor Ingresado No Valido, Intente de Nuevo" + "\"}");
            }
            Converter converter = new ConverterImpl();
            double answer = converter.fahrenheit2celsius(degrees);
            return new Gson().toJson("{\"fahrenheit\": \"" + degrees + "\", \"celsius\": \"" + answer + "\"}");
        });

        get("/convert/celsius/fahrenheit", (request, response) ->{
            response.type("application/json");
            double degrees;
            try {
                degrees = Double.parseDouble(request.queryParams("value"));
            } catch (Exception e) {
                return new Gson().toJson("{\"Error\": \"" + "Valor Ingresado No Valido, Intente de Nuevo" + "\"}");
            }
            Converter converter = new ConverterImpl();
            double answer = converter.celsius2fahrenheit(degrees);
            return new Gson().toJson("{\"celsius\": \"" + degrees + "\", \"fahrenheit\": \"" + answer + "\"}");
        });
    }

    /**
     * Retorna el puerto por el que debería correr el servidor, creado para evitar errores en un ambiente de
     * despliegue no local
     *
     * @return - puerto.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8080;
    }

}
