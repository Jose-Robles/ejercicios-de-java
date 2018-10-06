/**
 * Ejercicio 15 Tema 04
 *
 * Crea una pirámide con el caracter introducido y de la forma que se introoduzca
 *
 * @author José Robles Bastidas
*/
public class Ejercicio15 {
	public static void main(String[] args) {
        String espacio = " ";
        System.out.println("¡Vamos a montar una pirámide!");
        System.out.print("Para ello voy a necesitar un carácter para poder hacerla >>");
        String caracter = System.console().readLine();
        System.out.println("\nBien, ahora tienes que decirme la forma de la pirámide:");
        System.out.println("1 . hacia arriba.\n2 . hacia abajo.\n3 . hacia la derecha.");
        System.out.println("4 . hacia la izquierda.\n");
        System.out.println("¿Qué eliges?");
        int forma = Integer.parseInt(System.console().readLine());
        if (forma <= 0 || forma >= 5){
            System.out.println("¡Tienes que introducir el número que corresponde a tu decisión!");
            forma = Integer.parseInt(System.console().readLine());
        }
        switch (forma) {
            case 1:
                System.out.println((espacio*4)+(caracter*1)+(espacio*4));
                System.out.println((espacio*3)+(caracter*3)+(espacio*3));
                System.out.println((espacio*2)+(caracter*5)+(espacio*2));
                System.out.println((espacio*1)+(caracter*7)+(espacio*1));
                System.out.println((espacio*0)+(caracter*9)+(espacio*0));
                break;
            case 2:
                System.out.println((espacio*0)+(caracter*9)+(espacio*0));
                System.out.println((espacio*1)+(caracter*7)+(espacio*1));
                System.out.println((espacio*2)+(caracter*5)+(espacio*2));
                System.out.println((espacio*3)+(caracter*3)+(espacio*3));
                System.out.println((espacio*4)+(caracter*1)+(espacio*4));
                break;
            case 3:
                System.out.println((caracter*1));
                System.out.println((caracter*2));
                System.out.println((caracter*3));
                System.out.println((caracter*4));
                System.out.println((caracter*5));
                System.out.println((caracter*6));
                System.out.println((caracter*7));
                System.out.println((caracter*8));
                System.out.println((caracter*9));
                System.out.println((caracter*10));
                System.out.println((caracter*11));
                System.out.println((caracter*12));
                System.out.println((caracter*13));
                System.out.println((caracter*14));
                System.out.println((caracter*15));
                System.out.println((caracter*14));
                System.out.println((caracter*13));
                System.out.println((caracter*12));
                System.out.println((caracter*11));
                System.out.println((caracter*10));
                System.out.println((caracter*9));
                System.out.println((caracter*8));
                System.out.println((caracter*7));
                System.out.println((caracter*6));
                System.out.println((caracter*5));
                System.out.println((caracter*4));
                System.out.println((caracter*3));
                System.out.println((caracter*2));
                System.out.println((caracter*1));
                break;
            case 4:
                System.out.println((espacio*15)+(caracter*1));
                System.out.println((espacio*14)+(caracter*2));
                System.out.println((espacio*13)+(caracter*3));
                System.out.println((espacio*12)+(caracter*4));
                System.out.println((espacio*11)+(caracter*5));
                System.out.println((espacio*10)+(caracter*6));
                System.out.println((espacio*9)+(caracter*7));
                System.out.println((espacio*8)+(caracter*8));
                System.out.println((espacio*7)+(caracter*9));
                System.out.println((espacio*6)+(caracter*10));
                System.out.println((espacio*5)+(caracter*11));
                System.out.println((espacio*4)+(caracter*12));
                System.out.println((espacio*3)+(caracter*13));
                System.out.println((espacio*2)+(caracter*14));
                System.out.println((espacio*1)+(caracter*15));
                System.out.println((espacio*2)+(caracter*14));
                System.out.println((espacio*3)+(caracter*13));
                System.out.println((espacio*4)+(caracter*12));
                System.out.println((espacio*5)+(caracter*11));
                System.out.println((espacio*6)+(caracter*10));
                System.out.println((espacio*7)+(caracter*9));
                System.out.println((espacio*8)+(caracter*8));
                System.out.println((espacio*9)+(caracter*7));
                System.out.println((espacio*10)+(caracter*6));
                System.out.println((espacio*11)+(caracter*5));
                System.out.println((espacio*12)+(caracter*4));
                System.out.println((espacio*13)+(caracter*3));
                System.out.println((espacio*14)+(caracter*2));
                System.out.println((espacio*15)+(caracter*1));
                break;
            default:
                System.out.println("Parece que has introducido de nuevo el número mal.");
                System.out.println("Si es que no aprendes...Yo no se ya que voy a hacer contigo.");
                break;
        }
    }
}