/**
 * Ejercicio 24 Tema 04
 * 
 * Este programa genera una nómina completa detallada de un empleado dados ciertos datos
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio24 {
    public static void main(String[] args) {
        System.out.print("Este programa va a generar un informe de nomina. Introduzca los ");
        System.out.println("siguientes datos requeridos para la cumplimetación.");
        System.out.println("Cargos Posibles: Prog.Junior, Prog.Senior y JefeDeProyecto");
        System.out.print("Introduzca su cargo: ");
        String cargo = System.console().readLine();
        double sueldoBase = 0;
        switch (cargo.toUpperCase()){
        case "PROG.JUNIOR":
        sueldoBase = 950;
        break;
        case "PROG.SENIOR":
        sueldoBase = 1200;
        break;
        case "JEFEDEPROYECTO":
        sueldoBase = 1600;
        break;
        }
        System.out.print("Días de viaje visitando clientes (mes): ");
        double diasViaje = Double.parseDouble(System.console().readLine());
        System.out.println("Estados Posibles: Soltero/a o Casado/a");
        System.out.print("Introduzca su Estado Civil: ");
        String estadoCivil = System.console().readLine();
        double IRPF = 0;
        switch (estadoCivil.toUpperCase()) {
        case "SOLTERO":
        case "SOLTERA":
        IRPF = 0.25;
        break;
        case "CASADO":
        case "CASADA":
        IRPF = 0.2;
        break;
        }
        double dietas = (diasViaje * 30);
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
        System.out.println("Sueldo Base: \t\t" + sueldoBase);
        System.out.println("Dietas (" + diasViaje + " Días de Viaje):\t " + dietas);
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
        System.out.println("Sueldo Bruto: \t\t" + (sueldoBase + dietas));
        System.out.println("Retención IRPF: (" + IRPF + ") \t" + ((sueldoBase + dietas) * IRPF));
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
        System.out.println("Sueldo Neto: \t\t" + ((sueldoBase + dietas) - ((sueldoBase + dietas) * IRPF)));
        System.out.println("≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡");
    }
}