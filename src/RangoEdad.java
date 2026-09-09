import java.util.Scanner;

public class RangoEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = 0;

        while (edad > 120 || edad < 1) {
            System.out.print("Ingrese su edad: ");
            edad = sc.nextInt();

            if (edad >= 60 && edad <=120) {
                System.out.println("Tu edad es: " + edad + " y estas en la Tercera edad");
            }else if(edad >=26 && edad < 60){
                System.out.println("Tu edad es: " + edad + " y estas en la Adultez");
            }else if(edad >= 18 && edad < 26){
                System.out.println("Tu edad es: " + edad + " y estas en la Juventud");
            }else if (edad >= 13 && edad < 18){
               System.out.println("Tu edad es: " + edad + " y estas en la Adolescencia"); 
            }else if (edad >= 1 && edad < 13){
                System.out.println("Tu edad es: " + edad + " y estas en la Niñez");
            }else{
                System.out.println("Tu edad es: " + edad + " no es valida, ingresa una edad ente (1 y 120)");
            }
        }
    }
}
