/**
 * Ejercicio 17 Tema 05
 * 
 * Suma los 100 números siguientes a un número positivo y entero introducido
 * 
 * @author José R
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número positivo y entero por favor >>");
        int numero = s.nextInt();
        if(numero >0){
            System.out.print("La suma de los 100 números siguientes al número introducido es: ");
            System.out.println(((2*numero)+101)*50);
        } else{
            System.out.println("El número introducido no es válido");
        }
    }
    
}
