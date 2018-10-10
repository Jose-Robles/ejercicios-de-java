/**
 * Ejercicio 05 tema 05
 * 
 * Muestra los numeros del 320 al 160 contando de 20 en 20 hacia atrás.
 *
 * @author José Robles Bastidas
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int i = 320;
        while(i >= 160){
            System.out.println(i);
            i = i-20;
        }
    }
}