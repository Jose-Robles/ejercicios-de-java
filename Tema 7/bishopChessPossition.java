/**
 * 
 * It can tell you where the bishop can be moved in a chessboard. Also it includes self possition.
 * 
 * @author Jose Robles Bastidas & Borja Sevilla Ruiz
 */
import java.util.Scanner;
public class bishopChessPossition {
	public static void main(String[] args) {
      	// First things first, we have to define all the local variables we'll use
		Scanner s = new Scanner(System.in);
		char bishop = '\u2657';
      	String lightBlue = "\033[36m";
      	String white = "\033[37m";
      	String orange = "\033[33m";
      	int lang;
		int[][] chessboard = new int[8][8]; // [x][y] format. Like the example 'd5'
      	String[][] info = new String[2][5];
      	info[0][0] = "Este es un programa muestra los posibles movimientos del Alfil";
      	info[0][1] = "Debes haber introducido algún dato erróneo, por favor vuelve a intentarlo.";
      	info[0][2] = "\t\t\t (ejemplo:'d5')";
      	info[0][3] = "Introduzca la posición del Alfil: ";
      	info[0][4] = "El Alfil puede moverse a las siguientes posiciones:";
      	info[1][0] = "This is a program that shows all the possible movements of a chess bishop inside a chessboard.";
      	info[1][1] = "You may have been wrong introducing the possition, please try again.";
      	info[1][2] = "\t\t\t (example:'d5')";
      	info[1][3] = "Introduce the bishop possition: ";
      	info[1][4] = "Well, your bishop can move to those possitions:";
      	String bishopPos;
      	int posY;
      	int posX;
      	boolean loopRepeat = false;
        // Lets start building the essencials, a front-end where we can divide all the code purposes
		System.out.print("Choose a language: " + orange + "es/en  " + white);
      	switch(s.nextLine().toLowerCase()){
            default:
            case "en":
				lang = 1;
				System.out.println("");
                break;
            case "es":
				lang = 0;
				System.out.println("");
                break;
        }
        System.out.println(info[lang][0]);
        do{  //this do-while sentence is built to require valid information.
          	if(loopRepeat){
              	System.out.println(info[lang][1]);
              	System.out.println(lightBlue + info[lang][2] + white);
            }
          	System.out.print(info[lang][3]);
       	 	bishopPos = s.nextLine().toLowerCase();
            posX = (int)(bishopPos.charAt(0));
          	posY = (int)(bishopPos.charAt(1));
          	loopRepeat = true;
        }while(posY > 56 || posY < 48 || posX < 97 || posX > 104);
		System.out.println(info[lang][4]);
      	for(int i = 0; i<chessboard.length;i++){
          	for(int j = 0;j<chessboard[0].length;j++){
				if(Math.abs((97+i)-(posX))==Math.abs((55-j+1)-(posY))){
					System.out.print((char)((97 + i)) + "" + (char)((56-j)) + "· ");
				}
			}
		}
		System.out.println("");
    }
}