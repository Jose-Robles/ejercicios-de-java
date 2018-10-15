/**
 * Ejercicio 16 tema 05
 * 
 * Comprueba si un numero introducido es primo o no
 *
 * @author José Robles Bastidas
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        System.out.print("Introduce un número para comprobar si es primo o no >>");
        int numero = Integer.parseInt(System.console().readLine());
        boolean primo = false;
        for (int n = 2; n < numero; n++) {
            if(numero%n == 0){
                primo = true;
            }
        }
        if(primo == true){
            System.out.println("Este número es primo");
        } else{
            System.out.println("Este número no es primo");
        }
    }
}