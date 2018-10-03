/**
 * Ejercicio 05 tema 04
 * 
 * Este programa resuelve ecuaciones del tipo ax + b = 0
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        String celeste = "\033[36m";
        String morado = "\033[35m";
        System.out.println(naranja + "<<Este programa resuelve ecuaciones del tipo ax + b = 0 >>");
        System.out.println(blanco + "Por favor, introduzca el valor de a:");
        double a = Double.parseDouble(System.console().readLine());
        System.out.println("Ahora introduzca el valor de b:");
        double b = Double.parseDouble(System.console().readLine());
        if(b < 0.0002 && b > -0.0002){
            System.out.println(morado + "Escribe un número que no sea 0 o que al menos se aleje:");
            b = Double.parseDouble(System.console().readLine());
        }
        double x = (a / (-b));
        System.out.print(blanco + "\nEl valor de " + naranja + "x" + blanco + " es :  ");
        System.out.printf(naranja + "%.2f\n\n" + blanco, x);
    }
}