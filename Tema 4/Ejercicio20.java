/**
 * Ejercicio 20 Tema 04
 * 
 * Comprueba si un número dado es capicúa o no.
 * 
 * @author José Robles Bastidas
*/
public class Ejercicio20 {
    public static void main(String[] args) {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int e = 0;
        System.out.println("Este programa comprueba si los números son capicúa o no.");
        System.out.print("Introduce un número entero de hasta 5 cifras por favor >>");
        int n = Integer.parseInt(System.console().readLine());
        // Después de comprobar si cumpple los requerimientos el número introducido
        // hay que conocer cada cifra del número, por eso se le asigna cada cifra a una variable
        if(n < 0 && n >= 100000){
            e = n%10;
            d = n%100 - e;
            c = n%1000 - d;
            b = n%10000 - c;
            a = n%100000 - b;
            }else{
            System.out.println("\nERROR: No puedo procesar una cadena más larga de 5 cifras.");
        }
        // Y ahora podemos usar las reglas de los números capicúa
        if(a==0){
            if(b==0){
                if(c==0){
                    if(d==0){
                        if(e==0){
                            System.out.println("\nEs un número capicúa");
                        }else{
                            System.out.println("\nEs un número capicúa");
                        }
                    } else{
                        if(d==e){
                            System.out.println("\nEs capicúa!");
                        } else{
                            System.out.println("\nNo es capicúa!");
                        }
                    }
                } else{
                    if(c==e){
                        System.out.println("\nEs capicúa!");
                    } else{
                        System.out.println("\nNo es capicúa!");
                    }
                }
            } else{
                if(b==e && c==d){
                    System.out.println("\nEs capicúa!");
                } else{
                    System.out.println("\nNo es capicúa!");
                }
            }
        } else{
            if(a==e && b==d){
                System.out.println("\nEs capicúa!");
            } else{
                System.out.println("\nNo es capicúa!");
            }
        }
    }
}
