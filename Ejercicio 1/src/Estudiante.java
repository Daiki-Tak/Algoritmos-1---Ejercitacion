public class Estudiante {
    private String nombre;
    private int edad;
    private static int estudiantesTotales = 0;

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        Estudiante.agregarEstudiante();
    }

    public void presentarse(){
        System.out.println("Hola, mi nombre es "
         + this.nombre + " y tengo " 
         + this.edad + " años.");
    }

    public static int getEstudiantesTotales(){
        return estudiantesTotales;
    }

    public static void agregarEstudiante(){
        estudiantesTotales++;
    }
}
