/**
 * Ejercicio 14 tema 05
 * 
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Este programa calcula una potencia en función a una base y un exponente");
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        double potencia = 1;
        if (exponente == 0) {
            potencia = 1;
        }
        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                potencia *= base;
            }
        }
        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++) {
                potencia *= base;
            }
            potencia = 1/potencia;
        }
        System.out.println(base + "^" + exponente + " = " + potencia);
    }
}