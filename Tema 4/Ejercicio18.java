/**
 * Ejercicio 18 Tema 04
 * 
 * Devuelve la primera cifra del número introducido
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        System.out.print("Introduce un número entero de hasta 5 cifras por favor >>");
        int n = Integer.parseInt(System.console().readLine());
        if(n < 0 && n >= 100000){
            if(n%10000 != 0){
                System.out.println("\nLa primera cifra es : " + n%10000);
            } else if(n%1000 != 0){
                System.out.println("\nLa primera cifra es : " + n%1000);
            }
            else if(n%100 != 0){
                System.out.println("\nLa primera cifra es : " + n%100);
            }
            else if(n%10 != 0){
                System.out.println("\nLa primera cifra es : " + n%10);
            } else{
                System.out.println("\nLa primera cifra (y última) es : " + n);
            }
        } else{
            System.out.println("\nERROR: No puedo procesar una cadena más larga de 5 cifras.");
        }
    }
}