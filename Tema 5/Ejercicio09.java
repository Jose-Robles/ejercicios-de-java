/**
 * Ejercicio 09 tema 05
 * 
 * Nos dice cuantos dígitos tiene un numero introducido.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        int numeroDeDigitos = 1;
        System.out.print("Introduzca un número entero >>");
        int numero = Integer.parseInt(System.console().readLine());
        int n = numero;
        while (n > 10) {
          n /= 10;
          numeroDeDigitos++;
        }
        System.out.println(numero + " tiene " + numeroDeDigitos + " dígito/s.");
    }
}