/**
 * Ejercicio 05
 * 
 * Muestra el horario de clase pero con colores por cada asignatura
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String rojo = "\033[31m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String verde = "\033[32m";
    String blanco = "\033[37m";

    System.out.println("Lunes\tMartes\tMiércoles.\tJueves.\tViernes");
    System.out.println("*********\t*********\t*********\t*********\t*******");
    System.out.println(azul + "EED" + morado + "\tSINF" + celeste + "\tPRO\tPRO" + morado + "\tSINF");
    System.out.println(rojo + "LM" + morado + "\tSINF" + celeste + "\tPRO\tPRO" + morado + "\tSINF");
    System.out.println(rojo + "LM" + morado + "\tSINF" + celeste + "\tPRO" + azul + "\tEED" + morado + "\tSINF");
    System.out.println(verde + "BBDD" + celeste + "\tPRO" + verde + "\tBBDD" + azul + "\tEED" + blanco + "\tFOL");
    System.out.println(verde + "BBDD" + celeste + "\tPRO" + verde + "\tBBDD" + rojo + "\tLM" + blanco + "\tFOL");
    System.out.println(verde + "BBDD" + celeste + "\tPRO" + verde + "\tBBDD" + rojo + "\tLM" + blanco + "\tFOL");
  }
}
