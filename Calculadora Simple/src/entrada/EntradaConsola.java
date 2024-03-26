package entrada;
import java.util.Scanner;
import salida.SalidaConsola;
import java.util.Arrays;

public class EntradaConsola {
    private static String[] operadores = {"+", "-", "*", "/"};
    
    public static void main(String[] args) {
        try(Scanner obj = new Scanner(System.in)){
            System.out.println("Ingrese el primer número: ");
            int num1 = obj.nextInt();

            System.out.println("Ingrese el operador (+, -, *, /): ");
            String operador = obj.nextLine();
            while(!Arrays.asList(operadores).contains(operador)){
                SalidaConsola.mostrarError("Operador inválido");
                System.out.println("Ingrese el operador (+, -, *, /): ");
                operador = obj.nextLine();
            }

            System.out.println("Ingrese el segundo número: ");
            int num2 = obj.nextInt();

            switch(operador){
                case "+":
                    SalidaConsola.mostrarResultado(num1 + num2);
                    break;
                case "-":
                    SalidaConsola.mostrarResultado(num1 - num2);
                    break;
                case "*":
                    SalidaConsola.mostrarResultado(num1 * num2);
                    break;
                case "/":
                    SalidaConsola.mostrarResultado(num1 / num2);
                    break;
            }
        }
    }
}
