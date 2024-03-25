public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private String[] materias;

    public Estudiante(String nombre, int edad, String carrera, String[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.materias = materias;
    }

    public void getEstudiante() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Materias: ");
        System.out.println(this.materias.toString());
    }
}
