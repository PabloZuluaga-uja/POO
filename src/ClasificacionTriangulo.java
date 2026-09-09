import java.util.Scanner;

public class ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.print("Digite en centimetros el valor del primer lado del triangulo: ");
        double lado1 = sc.nextDouble();
        System.out.print("Digite en centimetros el valor del segundo lado del triangulo: ");
        double lado2 = sc.nextDouble();
        System.out.print("Digite en centimetros el valor del tercer lado del triangulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triangulo es Equilatero");
        }else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
            System.out.println("El triangulo es Isosceles");
        }else{
            System.out.println("El tirangulo es escaleno");
        }
    }
}
