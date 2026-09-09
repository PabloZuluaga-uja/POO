import java.util.Scanner;

public class PromedioEstudiante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3:");
        double nota3 = sc.nextDouble();

        double resultado = (nota1 * 0.30) + (nota2 * 0.30) + (nota3 * 0.40);

        String notaDefinitiva = (resultado >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("Resultado de la materia: %.2f%n", resultado);
        System.out.println("Nota Definitiva: " + notaDefinitiva);

        sc.close();
    }
    
}
