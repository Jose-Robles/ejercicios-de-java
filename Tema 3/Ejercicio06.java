/**
 * Ejercicio 06 tema 03
 * 
 * Calcula el área de un triángulo introduciendo la longitud de la base y la altura
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        System.out.print("Considerando un triángulo de la base y altura ");
        System.out.print(azul + "b" + blanco + " e " + azul + "h");
        System.out.println(blanco + " este programa calculará el área de dicho triángulo.");
        System.out.println("Introduzca el primer valor para la base " + azul + "b" + blanco + " :");
        float b = Float.parseFloat(System.console().readLine());
        System.out.println("Introduzca el valor de la altura " + azul + "h" + blanco + " :");
        float h = Float.parseFloat(System.console().readLine());
        System.out.println("El área del triángulo es " + azul + ((b*h)/2) + blanco);
    }
}
