package salida;

public class SalidaConsola {
    public static void contarPalabras(String frase, String separador) {
        if(separador.equals("")) {
            separador = " ";
        }
        String[] palabras = frase.split(separador);
        System.out.println("Cantidad de palabras: " + palabras.length);
    }
}
