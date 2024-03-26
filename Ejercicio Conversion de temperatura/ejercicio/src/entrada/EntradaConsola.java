package entrada;
import salida.SalidaConsola;

import java.util.Arrays;
import java.util.Scanner;

public class EntradaConsola {
    private static String[] unidad = {"C", "F"};

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese la temperatura:");
            double temperatura = scanner.nextDouble();
            System.out.println("Ingrese la unidad de temperatura (C/F):");
            String unidadTemperatura = scanner.nextLine();
            while(!Arrays.asList(unidad).contains(unidadTemperatura)) {
                System.out.println("Unidad de temperatura no válida. Ingrese la unidad de la temperatura (C/F):");
                unidadTemperatura = scanner.nextLine();
            }
            SalidaConsola.mostrarTemperatura(temperatura, unidadTemperatura);
        }
    }
}
