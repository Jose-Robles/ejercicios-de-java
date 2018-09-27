/**
 * Ejercicio 03 tema 03
 * 
 * Conversor de pesetas a euros
 *
 * @author José Robles Bastidas
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print(azul + "Este es un programa que muestra la conversión");
        System.out.println(" de pesetas a euros");
        System.out.println("Ingrese la cantidad de pesetas que desea convertir : ");
        float pesetas = Float.parseFloat(System.console().readLine());
        float euros = pesetas / 166;
        System.out.println(naranja + pesetas + blanco + " Pesetas son: " + naranja + euros + blanco + " Euros");
    }
}