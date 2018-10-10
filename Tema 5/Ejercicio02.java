/**
 * Ejercicio 02 tema 05
 * 
 * Muestra los numeros de 0 a 100 que son divisibles entre 5.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i%5 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}