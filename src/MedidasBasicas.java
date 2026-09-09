import java.util.Scanner;

public class MedidasBasicas {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.print("Radio del circulo: ");
        double radio = sc.nextDouble();

        double area1 = Math.PI * Math.pow(radio, 2);

        double circunferencia = (2 * Math.PI * radio );

        System.out.printf("El area del circulo es: %.2f%n", area1);
        System.out.printf("El circunferencia del circulo es: %.2f%n", circunferencia);


        System.out.println("---------------Calculando el area de un rectangulo ----------------");
        
        System.out.print("Altura del rectangulo: ");
        double altura = sc.nextDouble();

        System.out.print("Base del rectangulo: ");
        double base = sc.nextDouble();

        double area2 = (base * altura);
        double perimetro = 2 * (base + altura);

        System.out.printf("El area del Rectangulo es: %.2f%n", area2 );
        System.out.printf("El perimetro del rectangulo es: %.2f%n ", perimetro );

        sc.close();

    }
    
}
