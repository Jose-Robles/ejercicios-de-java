/**
 * Ejercicio 02 tema 03
 * 
 * Conversor de euros a pesetas
 *
 * @author José Robles Bastidas
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print(azul + "Este es un programa que muestra la conversión");
        System.out.println(" de euros a pesetas");
        System.out.println("Ingrese la cantidad de euros que desea convertir : ");
        float euros = Float.parseFloat(System.console().readLine());
        float pesetas = euros * 166;
        System.out.println(naranja + euros + blanco + " Euros son: " + naranja + pesetas + blanco + " Pesetas");
    }
}