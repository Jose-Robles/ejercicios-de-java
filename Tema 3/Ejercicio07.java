/**
 * Ejercicio 07 tema 03
 * 
 * Calcula el total de una factura a partir de una base imponible dada
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio07{
    public static void main(String[] args){
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        System.out.print(azul + "Este programa calcula el total con el iva a una ");
        System.out.println("base imponible previamente almacenada");
        System.out.println(blanco + "Inserte la base imponible : ");
        float baseImponible = Float.parseFloat(System.console().readLine());
        float totalFactura = baseImponible * Float.parseFloat("1.25");
        String.out.println(blanco + "Capital de base imponible : \t" + naranja + String.parseString(baseImponible) + " Euros" + blanco);
        String.out.println(blanco + "Total (iba incluido) : \t" + naranja + totalFactura + " Euros" + blanco);
    }
}