package entrada;
import java.util.Scanner;
import salida.SalidaConsola;

public class EntradaConsola {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un número positivo: ");
            int numero = scanner.nextInt();
            while (numero < 1) {
                System.out.println("El número ingresado es 0 o no es positivo. Ingrese un número positivo: ");
                numero = scanner.nextInt();                
            }

            SalidaConsola salida = new SalidaConsola();
            salida.salida(numero);
        }
    }
}
