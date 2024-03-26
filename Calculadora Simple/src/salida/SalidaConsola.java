package salida;

public class SalidaConsola {
    public static void mostrarResultado(int num1, String operador, int num2){
        System.out.println("El resultado de la operación es: ");
        switch(operador){
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println((double) num1 / num2);
                break;
        }
    }
    public static void mostrarError(String mensaje){
        System.out.println("Error: " + mensaje);
    }
}
