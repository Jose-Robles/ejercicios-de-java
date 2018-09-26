/**
 * Ejercicio 03 tema 02
 * 
 * Muestra tres variables correspondientes a mi nombre, dirección y teléfono.
 * 
 * @author José Robles Bastidas
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String name = "\033[32mNombre :   \t \033[37mJosé Robles Bastidas";
        String address = "\033[32mDirección : \t \033[37mCalle Virgen de la Esperanza nº28";
        String number = "\033[32mTeléfono:   \t \033[37m+34 654278402";
        System.out.println(name);
        System.out.println(address);
        System.out.println(number);
    }
}