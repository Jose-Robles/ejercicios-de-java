/**
 * Ejercicio 01 tema 05
 * 
 * Muestra los numeros de 0 a 100 que son divisibles entre 5.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i%5 == 0){
                System.out.println(i);
            }
        }
    }
}
