/**
 * Ejercicio 07 tema 05
 * 
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Introduzca número pin:");
            pin = System.console().readLine();
            if (pin.equals("1234")){
                System.out.println("“La caja fuerte se ha abierto satisfactoriamente.");
                i = 4;
            } else{
                System.out.println("Losiento, esa no es la combinación.");
                System.out.println("Quedan " + (4-i) + " intentos")
            }
        }
    }
}