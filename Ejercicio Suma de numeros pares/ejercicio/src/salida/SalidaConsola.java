package salida;

public class SalidaConsola {
    private int suma = 0;

    public void salida(int numero) {
        for(int i = numero; i > 1; i--) {
            if (i % 2 == 0) {
                this.suma = this.suma + i;
            }
        }
        System.out.println("La suma de los números pares del 1 al " + numero + " es: " + this.suma);
    }
}
