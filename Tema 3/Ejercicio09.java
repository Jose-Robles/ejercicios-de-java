/**
 * Ejercicio 09 tema 03
 * 
 * Calcula el volumen de un cono introduciendo la altura y el radio de la base.
 * 
 * @author José Robles Bastidas
 */
import java.lang.Math.*;
public class Ejercicio09 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        double pi = Math.PI;
        double radio;
        double altura;
        System.out.print("Para calcular el volumen de un cono");
        System.out.println(" necesitaremos el radio de la base y la altura");
        System.out.print("Introduce el radio a continuación >>");
        radio = Double.parseDouble(System.console().readLine());
        System.out.print("Ahora introduce la altura a continuación >>");
        altura = Double.parseDouble(System.console().readLine());
        System.out.println(naranja + "Calculando...");
        System.out.print(blanco + "El volumen del cono según los parámetros dados es: ");
        System.out.print(azul + ((1/3) * (pi) * (radio*radio) * (altura)) + blanco);
    }
}