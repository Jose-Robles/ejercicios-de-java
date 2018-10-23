/**
 * Ejercicio 03 tema 05
 * 
 * Muestra los numeros de 0 a 100 que son divisibles entre 5.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i%5 == 0){
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}