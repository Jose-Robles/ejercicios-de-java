/**
 * Ejercicio 33 Tema 05
 * 
 * Dibuja una U en la pantalla según una altura introducida. 
 * 
 * @author José Robles
 */
public class Ejercicio33 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());

    // Palos verticales de la U
    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    // Base de la U
    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
