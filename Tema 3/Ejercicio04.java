/**
 * Ejercicio 04 tema 03
 * 
 * Suma, resta, multiplica y divide dos números dados
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        System.out.println("Introduzca el primer valor para la variable x :");
        float x = Float.parseFloat(System.console().readLine());
        System.out.println("Introduzca el primer valor para la variable y :");
        float y = Float.parseFloat(System.console().readLine());
        System.out.println("Esta es la suma de x e y" + "\t\t" + (x + y));
        System.out.println("Esta es la resta de x e y" + "\t\t" + (x - y));
        System.out.println("Esta es la multiplicación de x e y" + "\t" + (x * y));
        System.out.println("Esta es la división de x e y" + "\t\t" + (x / y));
    }
}