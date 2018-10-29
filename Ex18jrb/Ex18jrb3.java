/**
 * Ejercicio número 3 del examen.
 * 
 * 
 * 
 * @author José Robles Bastidas
 * Fecha: 24/10/2018
*/
public class Ex18jrb3 {
    public static void main(String[] args) {
        System.out.println("Introduzca la altura de la figura: ");
        int n = Integer.parseInt(System.console().readLine());
        int planta = n;
        int espacios;
        int asteriscos;
        while (planta >= 0) {
            espacios = n-planta;
            asteriscos = n-espacios;
            for(;espacios >= 0; espacios--){
                System.out.print(" ");
            }
            for(;asteriscos > 0; asteriscos--){
                System.out.print("*");
            }
            System.out.println();
            planta--;
        }
    }
}