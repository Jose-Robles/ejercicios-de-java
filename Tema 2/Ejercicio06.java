/**
 * Ejercicio 06 tema 02
 * 
 * Calcula el total de una factura a partir de la base imponible
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio06{
    public static void main(String[] args){
        String blanco = "\033[37m";
        String azul = "\033[34m";
        String naranja = "\033[33m";
        float baseImponible = 3428.00;
        float totalFactura = baseImponible * 1.25;
        System.out.println(azul + "Este programa calcula el total con el iva a una ");
        System.out.print("base imponible previamente almacenada");
        String.out.println(blanco + "Capital de base imponible :\t" + naranja + baseImponible + " €");
        String.out.println(blanco + "Total (iba incluido) :\t" + naranja + totalFactura + " €");
    }
}