/**
 * Ejercicio 22 Tema 05
 * 
 * Muestra los n�mero primos del 2 al 100 incluidos 
 * 
 * @author Jos� Robles
 */
public class Ejercicio22 {

  public static void main(String[] args) {

    System.out.print("Números primos entre 2 y 100: ");

    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {

      // comprueba si n es primo
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      // si n es primo, se muestra por pantalla
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}
