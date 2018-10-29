/**
 * Ejercicio número 1 del examen.
 * 
 * Calcula el precio de una entrada de teatro de manera parcial entorno a ciertas variables
 * luego representa el precio final de las entradas desglosado.
 * 
 * @author José Robles Bastidas
 * Fecha: 24/10/2018
 */
public class Ex18jrb1 {
    public static void main(String[] args) {
        double precioBase = 0.0;
        double total = 0.0;
        double descuento = 0.0;
        int numeroParejas = 0;
        boolean salir = false;
        System.out.println("Venta de entradas ColiseoCampa");
        System.out.println("Número de entradas: ");
        int numeroEntradas = Integer.parseInt(System.console().readLine());
        System.out.println("Día de la semana: ");
        String dia = System.console().readLine().toUpperCase();
        System.out.println("¿Tiene tarjeta ColiseoCampa? (s/n): ");
        Boolean tarjeta = System.console().readLine().toUpperCase().equals("S");
        switch (dia) {
            case "LUNES":
            case "MARTES":
            case "VIERNES":
            case "SABADO":
            case "DOMINGO":
                precioBase = 10.0;
                total = precioBase * numeroEntradas;
                break;
            case "MIERCOLES":
            case "MIÉRCOLES":
                precioBase = 8.0;
                total = precioBase * numeroEntradas;
                break;
            case "JUEVES":
                precioBase = 10.0;
                numeroParejas = numeroEntradas/2;
                total = ((precioBase * (numeroEntradas-(numeroParejas*2))) + (15 * numeroParejas));
                break;
            default:
                System.out.println("Asegurate de introducir correctamente los datos");
                salir = true;
                break;
        }
        if (tarjeta == true && salir == false){
            descuento = total / 10;
        } else{
            descuento = 0.0;
        }
        //Comienza el formateo de los datos
        if(salir == false){
            System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
            if(numeroParejas > 0){
                System.out.println("Entradas parejas \t " + numeroParejas + " €");
                System.out.println("Precio unitario \t15.00 €");
            }
            System.out.print("Entradas individuales \t " + (numeroEntradas-(numeroParejas*2)));
            System.out.println(" €");
            System.out.println("Precio unitario     \t10.00 €");
            System.out.println("Total \t\t\t" + total + " €");
            System.out.println("Descuento\t\t " + descuento + " €");
            System.out.println("A pagar \t\t" + (total-descuento) + " €");
        } else{
            System.out.println("Error. Comprueba los datos de entrada.");
        }
    }
}