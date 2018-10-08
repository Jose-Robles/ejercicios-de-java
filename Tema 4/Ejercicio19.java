/**
 * Ejercicio 19 Tema 04
 * 
 * Devuelve la cantidad de cifras que tiene el número introducido
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero de hasta 5 cifras por favor >>");
        int n = Integer.parseInt(System.console().readLine());
        if(n < 0 && n >= 100000){
            if(n%10000 != 0){
                System.out.println("\nEl número introducido tiene 5 cifras");
            } else if(n%1000 != 0){
                System.out.println("\nEl número introducido tiene 4 cifras");
            }
            else if(n%100 != 0){
                System.out.println("\nEl número introducido tiene 3 cifras");
            }
            else if(n%10 != 0){
                System.out.println("\nEl número introducido tiene 2 cifras");
            } else{
                System.out.println("\nEl número introducido tiene 1 cifra");
            }
        } else{
            System.out.println("\nERROR: No puedo procesar una cadena más larga de 5 cifras.");
        }
    }
}