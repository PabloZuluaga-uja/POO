import java.util.Scanner;

public class CalificacionLetras {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println();
       System.out.print("Digite la nota obtenida: ");
       double nota = sc.nextDouble();

       if(nota > 4.5){
        System.out.println("Su nota es A - Excelente");
       }else if(nota >= 4){
        System.out.println("Su nota es B - Sobresaliente");
       }else if(nota >=3.5){
        System.out.println("Su nota es C - Aceptable"); 
       }else if(nota >= 3.0){
        System.out.println("Su nota es D - Aprobado minimo");
       }else{
        System.out.println("Su nota es F - Reprobado");
       }
    }
}
