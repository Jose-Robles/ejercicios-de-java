/**
 * Ejercicio 05 tema 02
 * 
 * Conversor de pesetas a euros
 *
 * @author José Robles Bastidas
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        float pesetas = 9876.64;
        float euros = pesetas / 166;
        System.out.println(azul + "Este es un programa que muestra la conversión");
        System.out.print(" de pesetas a euros");
        System.out.println(naranja + pesetas + blanco + " Pesetas son: " + naranja + euros + blanco + " Euros");
    }
}