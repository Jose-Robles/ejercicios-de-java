/**
 * Ejercicio 04 tema 02
 * 
 * Conversor de euros a pesetas
 *
 * @author José Robles Bastidas
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        float euros = 1234.56;
        float pesetas = euros * 166;
        System.out.println(azul + "Este es un programa que muestra la conversión");
        System.out.print(" de euros a pesetas");
        System.out.println(naranja + euros + blanco + " Euros son: " + naranja + pesetas + blanco + " Pesetas");
    }
}