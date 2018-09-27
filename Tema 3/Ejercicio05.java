/**
 * Ejercicio 05 tema 03
 * 
 * Calcula el área de un rectángulo introduciendo la longitud de los lados
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        System.out.print("Considerando un rectangulo de lados ");
        System.out.print(azul + "x" + blanco + " e " + azul + "y");
        System.out.println(blanco + " este programa calculará el área de dicho rectángulo.");
        System.out.println("Introduzca el primer valor para el lado " + azul + "x" + blanco + " :");
        float x = Float.parseFloat(System.console().readLine());
        System.out.println("Introduzca el segundo valor para el lado " + azul + "y" + blanco + " :");
        float y = Float.parseFloat(System.console().readLine());
        System.out.println("El área del rectángulo es " + azul + (x*y) + blanco);
    }
}
