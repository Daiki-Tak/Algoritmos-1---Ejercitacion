public class App {
    public static void main(String[] args) throws Exception {
        Estudiante juan = new Estudiante("Juan", 20);
        juan.presentarse();
        Estudiante maria = new Estudiante("Maria", 21);
        maria.presentarse();
        Estudiante pedro = new Estudiante("Pedro", 22);
        pedro.presentarse();
        System.out.println("Estudiantes totales: " + Estudiante.getEstudiantesTotales());
    }
}
