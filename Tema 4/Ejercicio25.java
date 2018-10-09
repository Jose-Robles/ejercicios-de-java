/**
 * Ejercicio 25 Tema 04
 * 
 * Calcula el precio de un pedido según el ancho y el alto de la bandera
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio25 {
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la bandera en cm: ");
        double alturaBandera = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca el Ancho (cm) de la Bandera: ");
        double anchoBandera = Double.parseDouble(System.console().readLine());
        System.out.print("¿Quiere que lleve Escudo Bordado (s/n): ");
        String escudo = System.console().readLine();
        double precioEscudo;
        double cm2 = (alturaBandera * anchoBandera);
        final double precioCm2 = 0.01;
        final double gastosEnvio = 3.25;
        System.out.println("\n------------------------------\n");
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("Bandera de (" + cm2 + " cm²): \t" + (cm2 * precioCm2) + " €");
        if (escudo.equals("s")) {
        precioEscudo = 2.5;
        System.out.println("Con Escudo: \t" + precioEscudo + " €");
        } else {
        precioEscudo = 0;
        System.out.println("Sin Escudo: \t" + precioEscudo + " €");
        }
        System.out.println("Gastos de Envío: \t" + gastosEnvio + " €");
        System.out.println("TOTAL: \t\t" + ((cm2 * precioCm2) + precioEscudo + gastosEnvio) + " €");
    }
}