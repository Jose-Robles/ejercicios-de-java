/**
 * Ejercicio 10 tema 03
 * 
 * Conversor de Megabytes a Kilobytes
 *
 * @author José Robles Bastidas
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print(azul + "\nEste es un programa que muestra la conversión");
        System.out.println(" de Megabytes a kilobytes.");
        System.out.println("Ingrese la cantidad de Megabytes que desea convertir : ");
        int megabytes = Integer.parseInt(System.console().readLine());
        int kilobytes = megabytes * 1024;
        System.out.println(naranja + megabytes + blanco + " Megabytes son: " + naranja + kilobytes + blanco + " Kilobytes");
    }
}