/**
 * Ejercicio 13 Tema 04
 * 
 * Ordena 3 n�meros dados de menor a mayor
 *
 * @author Jos� Robles Bastidas
*/
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa ordena 3 n�meros dados de menor a mayor");
    System.out.println("Introduce el primer n�mero: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo n�mero: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el tercer n�mero: ");
    int c = Integer.parseInt(System.console().readLine());
    if ((a > b) && (a > c) && (b > c)){
      System.out.println("He ordenado los n�meros y:  ");
      System.out.println("El primer valor es el: " + a );
      System.out.println("El segundo valor es el: " + b);
      System.out.println("El tercer valor es el: " + c );
    } else if ((b > a) && (b > c) && (a > c)){
        System.out.println("He ordenado los n�meros y:  ");
        System.out.println("El primer valor es el: " + b );
        System.out.println("El segundo valor es el: " + a);
        System.out.println("El tercer valor es el: " + c );
    } else if ((c > a) && (c > b) && (a > b)) {
        System.out.println("He ordenado los n�meros y:  ");
        System.out.println("El primer valor es el: " + c );
        System.out.println("El segundo valor es el: " + a);
        System.out.println("El tercer valor es el: " + b );
    } else if ((c > a) && (c > b) && (b > a)){
        System.out.println("He ordenado los n�meros y:  ");
        System.out.println("El primer valor es el: " + c );
        System.out.println("El segundo valor es el: " + b);
        System.out.println("El tercer valor es el: " + a );
    } else if ((a > c) && (a > b) && (c > b)) {
        System.out.println("He ordenado los n�meros y:  ");
        System.out.println("El primer valor es el: " + a );
        System.out.println("El segundo valor es el: " + c);
        System.out.println("El tercer valor es el: " + b );
    } else if ((b > a) && (b > a) && (c > a)) {
        System.out.println("He ordenado los n�meros y:  ");
        System.out.println("El primer valor es el: " + b );
        System.out.println("El segundo valor es el: " + c);
        System.out.println("El tercer valor es el: " + a );
    }
  }
}
