package entrada;
import java.util.Scanner;
import salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un número: ");
            int numero = scanner.nextInt();
            SalidaConsola.mostrarSalida(numero);
        }
    }
}
