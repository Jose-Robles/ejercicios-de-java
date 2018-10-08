/**
 * Ejercicio 17 Tema 04
 * 
 * Devuelve la última cifra del número introducido
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero por favor >>");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es" + n%10);
  }
}