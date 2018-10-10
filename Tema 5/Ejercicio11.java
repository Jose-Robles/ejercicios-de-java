/**
 * Ejercicio 11 tema 05
 * 
 * 
 *
 * @author José Robles Bastidas
 */
public class Ejercicio11 {
    public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
    }
}