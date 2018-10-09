/**
 * Ejercicio 23 Tema 04
 * 
 * Calcula el precio final en base a distintas variables.
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio23 {
    public static void main(String[] args) {
        System.out.println("FACTURACIÓN");
        System.out.println("Tipos de IVA: 'General', 'Reducido' y 'Superreducido'");
        System.out.print("Introduzca el tipo de IVA: ");
        String IVA = System.console().readLine();
        double tipoIVA = 0;
        switch (IVA) {
          case "General":
            tipoIVA = 0.21;
            break;
          case "Reducido":
            tipoIVA = 0.1;
            break;
          case "Superreducido":
            tipoIVA = 0.04;
            break;
        }
        System.out.println("Tipos de Descuentos: 'nopro', 'mitad', 'meno5' y '5porc'");
        System.out.print("Introduzca el código promocional: ");
        String descuento = System.console().readLine();
        double tipoDescuento = 0;
        System.out.print("Introduzca la Base Imponible: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
        switch (descuento) {
          case "nopro":
          tipoDescuento = 0;
          System.out.println("El precio es: " + (baseImponible + (baseImponible * tipoIVA) + tipoDescuento));
          break;
          case "mitad":
          tipoDescuento = 0.5;
          System.out.println("El precio es: " + (baseImponible + (baseImponible * tipoIVA) - (baseImponible * tipoDescuento)));
          break;
          case "meno5":
          tipoDescuento = -5;
          System.out.println("El precio es: " + (baseImponible + (baseImponible * tipoIVA) + tipoDescuento));
          break;
          case "5porc":
          tipoDescuento = 0.05;
          System.out.println("El precio es: " + (baseImponible + (baseImponible * tipoIVA) - (baseImponible * tipoDescuento)));
          break;
        }
    }
}