import java.util.Scanner;

public class NominaBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su valor hora del sueldo: ");
        double valorHora = sc.nextDouble();
        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();

        double salarioBruto = valorHora * horasTrabajadas;
        double descuentoSS = salarioBruto * 0.08;
        double descuentoRetencion = salarioBruto * 0.05;

        double salarioNeto = salarioBruto - descuentoSS - descuentoRetencion;

        System.out.println("");
        System.out.println("El nombre del empleado es: " + nombre);
        System.out.println("La cantidad de horas trabajadas son: " + horasTrabajadas);
        System.out.println("El salario bruto es: $ " + salarioBruto);
        System.out.println("El descuento de seguridad social es: $ " + descuentoSS);
        System.out.println("El descuento de retención en la fuente es: $ " + descuentoRetencion);
        System.out.println("El salario neto es: " + salarioNeto);
    }
}
