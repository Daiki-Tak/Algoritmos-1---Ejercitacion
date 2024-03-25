public class App {
    public static void main(String[] args) throws Exception {
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        System.out.println("Área del rectángulo 1: "
         + rectangulo1.getArea());
        System.out.println("Perímetro del rectángulo 1: "
         + rectangulo1.getPerimetro());
        
         Rectangulo rectangulo2 = new Rectangulo(10, 20);
        System.out.println("Área del rectángulo 2: "
         + rectangulo2.getArea());
        System.out.println("Perímetro del rectángulo 2: "
         + rectangulo2.getPerimetro());
    }
}
