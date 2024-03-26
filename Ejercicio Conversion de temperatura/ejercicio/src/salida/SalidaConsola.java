package salida;

public class SalidaConsola {
    public static void mostrarTemperatura(double temperatura, String unidad) {
        if(unidad.equals("C")) {
            double temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.println("Temperatura en Fahrenheit: " + temperaturaConvertida + "°F");
        } else if(unidad.equals("F")) {
            double temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.println("Temperatura en Celsius: " + temperaturaConvertida + "°C");
        }
    }
}
