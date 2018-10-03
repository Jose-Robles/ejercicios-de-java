/**
 * Ejercicio 06 tema 04
 * 
 * Este programa la formula de la caida libre y te muestra el tiempo que tarda un objeto
 * en tocar el suelo desde que se le suelta a 0 m/s a una altura "h"
 * 
 * @author José Robles Bastidas
 */
import java.lang.Math;
public class Ejercicio06 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        String celeste = "\033[36m";
        String morado = "\033[35m";
        double g = 9.81;
        System.out.print(celeste+"Este programa te permitirá saber cuánto tiempo tarda un objeto");
        System.out.println("cualquiera con solo saber la altura." + naranja);
        System.out.println("¿Quieres probar?" + blanco + " Bien, dime una altura en metros >> ");
        double h = Double.parseDouble(System.console().readLine());
        System.out.println("Emmm... ¡Vale ya lo tengo! El tiempo que tarda en caer es: ");
        Double t = Math.sqrt((2*h)/g);
        System.out.printf(azul + "%.3f segundos" + blanco, t);
    }
}