import java.util.Scanner;

public class IndiceDeMasa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso:");
        double peso = sc.nextDouble();

        System.out.println("Ingrese su estatura:");
        double estatura = sc.nextDouble();

        double resultado = peso / Math.pow(estatura,2);
        System.out.printf("Resultado es : %.2f%n", resultado);

        if (resultado < 18.5) {
            System.out.println("Bajo peso");
        } else if (resultado <= 24.9) {
            System.out.println("Peso normal");
        } else if (resultado <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

    }
}