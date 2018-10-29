/**
 * Ejercicio 10 tema 05
 * 
 * Calcula la media de los números introducidos.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        double numerosCantidad = 0;
        double numeroIntroducido = 0;
        double suma = 0;
        System.out.println("Este programa calcula la media de los números introducidos");
        System.out.println("Vaya introduciendo números, para parar ingrese un número negativo:");
        while (numeroIntroducido >= 0) {
          numeroIntroducido = Double.parseDouble(System.console().readLine());
          numerosCantidad++;
          suma += numeroIntroducido;
        }
        System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numerosCantidad - 1));
    }
}