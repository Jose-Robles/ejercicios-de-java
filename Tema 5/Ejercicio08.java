/**
 * Ejercicio 08 tema 05
 * 
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio08 {
    public static void main(String[] args) {
        System.out.println("Introduce un número >>");
        int numero = System.console().readLine();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + "= " + (numero*i));
        }
    }
}