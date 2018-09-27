/**
 * Ejercicio 11 tema 03
 * 
 * Conversor de Kilobytes a Megabytes.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print(azul + "\nEste es un programa que muestra la conversión");
        System.out.println(" de kilobytes a Megabytes.");
        System.out.println("Ingrese la cantidad de kilobytes que desea convertir : ");
        float kilobytes = Float.parseFloat(System.console().readLine());
        float megabytes = kilobytes / 1024;
        System.out.println(naranja + kilobytes + blanco + " kilobytes son: " + naranja + megabytes + blanco + " Megabytes");
    }
}