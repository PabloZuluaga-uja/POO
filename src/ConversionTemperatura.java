import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese temperatura en celsious: ");
        double celsious = sc.nextDouble();

        double fahrenheit = (celsious * 9/5) + 32;
        double kelvin = (celsious + 273.15);

        System.err.printf(" Celsius: %.2f%n", celsious);
        System.err.printf(" Fahrenheit: %.2f%n", fahrenheit);
        System.err.printf(" Kelvin: %.2f%n", kelvin);

        sc.close();
        
    }


}