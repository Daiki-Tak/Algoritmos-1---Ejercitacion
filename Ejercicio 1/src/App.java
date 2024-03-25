public class App {
    public static void main(String[] args) throws Exception {
        String[] materias = {"Algoritmos 1", "Probabilidad y Estadística",
         "Infraestructura para Ciencia de Datos"};
        Estudiante estudiante = new Estudiante("Juan", 20,
         "Ciencia de Datos", materias);
        estudiante.getEstudiante();
    }
}
