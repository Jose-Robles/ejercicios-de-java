/**
 * Ejercicio 07 tema 05
 * 
 * Simula la autenticación de una caja fuerte.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        for (int i = 3; i >= 0; i--) {
            System.out.println("Introduzca número pin:");
            String pin = System.console().readLine();
            if (pin.equals("1234")){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
                i = 0;
            } else{
                System.out.println("Losiento, esa no es la combinación.");
                System.out.println("Quedan " + i + " intentos");
            }
        }
    }
}