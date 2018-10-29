/**
 * Ejercicio número 2 del examen.
 * 
 * 
 * 
 * @author José Robles Bastidas
 * Fecha: 24/10/2018
*/
public class Ex18jrb2 {
    public static void main(String[] args) {
        int numeroDeDigitos = 1;
        int n;
        int m;
        int numeroIntroducido;
        System.out.print("Introduzca un número entero y lo transformaré: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
        n = numeroIntroducido;
        m = n%10;
        n /= 10;
        while (n > 10) {
            n /= 10;
            numeroDeDigitos++;
        }
        int proceso = m;
        for(; numeroDeDigitos>0; numeroDeDigitos--){
            proceso *= 10;
        }
        int numeroFinal = proceso + (numeroIntroducido/10);
        System.out.println("El número transformado es :" + numeroFinal);
    }
}