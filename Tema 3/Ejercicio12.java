/**
 * Ejercicio 12 tema 03
 * 
 * Calcula la nota mínima necesaria para superar la nota media propuesta del curso de programación
 * sabiendo la nota del primer examen y la ponderación del primer examen y del segundo (40% y 60%)
 *
 * @author José Robles Bastidas
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print("Introduce la nota del primer examen : ");
        float primerExamen = Float.parseFloat(System.console().readLine());
        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        float notaPropuesta = Float.parseFloat(System.console().readLine());
        float mínimaNota = (notaPropuesta - (primerExamen * Float.parseFloat("0.4"))) / Float.parseFloat("0.6");
        System.out.printf("Para tener un %f en el trimestre necesitas sacar", primerExamen );
        System.out.printf(" un %f en el segundo examen", mínimaNota );
    }
}