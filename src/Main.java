import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Radio círculo: ");
        double radiocir = sc.nextDouble();
        System.out.println("Radio cilindro: ");
        double radcil = sc.nextDouble();
        System.out.println("Altura cilindro: ");
        double altcil = sc.nextDouble();
        System.out.println("Volumen cilindro: ");
        double volcil = sc.nextDouble();

        Circulo circulo = new Circulo(radiocir);
        Cilindro cilindro = new Cilindro(radcil, altcil, volcil);

        System.out.println("El área del cilindro es: " + cilindro.getArea());
        System.out.println("El volumen del cilindro es: " + cilindro.getVolumen());
        System.out.println("El radio del cilindro es: " + cilindro.getRadio());
        System.out.println("La altura del cilindro es: " + cilindro.getAltura());
        System.out.println("El radio del círculo es: " + circulo.getRadio());
        System.out.println("El área del círculo es: " + circulo.getArea());
    }
}