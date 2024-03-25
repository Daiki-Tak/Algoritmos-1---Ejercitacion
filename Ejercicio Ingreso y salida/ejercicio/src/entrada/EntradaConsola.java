package entrada;
import java.util.Scanner;

import salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Ingrese el número de entradas: ");
            int numeroEntradas = obj.nextInt();
            for (int i = 0; i < numeroEntradas; i++) {
                System.out.println("Ingrese la entrada " + (i + 1) + ": ");
                String input = obj.nextLine();
                SalidaConsola.mostrar(input);
            }
        }
    }
}
