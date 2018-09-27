/**
 * Ejercicio 01 tema 03
 * 
 * Multiplica dos valores introducidos
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio01{
    public static void main(String[] args){
        double x;
        double y;
        System.out.println("Este programa multiplica dos valores dados");
        System.out.println("Por favor, ingrese un primer número : ");
        x = Double.parseDouble(System.console().readLine());
        System.out.println("Por favor, ahora ingrese un segundo número : ");
        y = Double.parseDouble(System.console().readLine());
        System.out.println("El resultado de la multiplicación es:" + (y*x));
    }
}