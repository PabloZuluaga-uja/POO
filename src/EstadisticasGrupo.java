import java.util.Scanner;

public class EstadisticasGrupo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        
        for (int i = 0; i < 10; i++) {
            double nota = -1;
            while (nota < 0 || nota > 5) {
                System.out.print("Ingrese la nota del estudiante " + (i + 1) + " (0-5): ");
                nota = sc.nextDouble();

                if (nota < 0 || nota > 5) {
                    System.out.println("Nota no valida, ingresa una nota del (1 al 5)");
                }else{
                    break;
                }
            }
            notas[i] = nota;
        }
        
        double sumaNotas = 0;
        for (int i = 0; i < 10; i++) {
            sumaNotas += notas[i];
        }
        double promedio = sumaNotas / 10;
        
        double notaMaxima = notas[0];
        int posicionNotaMax = 0;
        for (int i = 0; i < 10; i++) {
            if (notas[i] > notaMaxima) {
                notaMaxima = notas[i];
                posicionNotaMax = i;
            }
        }
        
        double notaMinima = notas[0];
        int posicionNotaMin = 0;
        for (int i = 0; i < 10; i++) {
            if (notas[i] < notaMinima) {
                notaMinima = notas[i];
                posicionNotaMin = i;
            }
        }
        
        int aprobados = 0, noprobados = 0;
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                noprobados++;
            }
        }
        
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota máxima: " + notaMaxima + " (posición: " + posicionNotaMax + ")");
        System.out.println("Nota mínima: " + notaMinima + " (posición: " + posicionNotaMin + ")");
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + noprobados);
    }
}