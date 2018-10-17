/**
 * Ejercicio 18 Tema 05
 * 
 * 
 * @author José Robles
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número positivo y entero por favor >>");
        int segundoNumero = s.nextInt();
        System.out.println("Introduzca otro número positivo y entero por favor >>");
        int primerNumero = s.nextInt();
        if(primerNumero > 0 && segundoNumero > 0){
            if(primerNumero>segundoNumero){
                for(int i = segundoNumero,int n; n < primerNumero;i+=7){
                    System.out.println(i);
                }
            }else if(segundoNumero>primerNumero){
                for(int i = primerNumero,int n; n < segundoNumero;i+=7){
                    System.out.println(i);
                }
            }else{
                System.out.println("Los números son iguales, no hay nada que hacer.");
            }

        } else{
            System.out.println("Alguno de los números introducidos no es válido");
        }
    }
}
