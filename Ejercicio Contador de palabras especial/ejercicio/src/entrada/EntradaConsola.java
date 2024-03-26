package entrada;
import java.util.Scanner;
import salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese una frase: ");
            String frase = scanner.nextLine();

            System.out.println("Ingrese un separador: ");
            String separador = scanner.nextLine();

            SalidaConsola.contarPalabras(frase, separador);
        }
    }
}
