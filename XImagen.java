/*
 *0 espacio
 *1 _
 *2 |
 *3 \
 *4 /
 *5 -
 *6 >
 *7 <
 *8 (
 *9 )
 *a *
 *b .
 *c @
 
 */
import java.io.File;
import java.util.Scanner;

public class XImagen{
	public static void main (String args[]){
		XImagen img=new XImagen ();
	}
	
	public XImagen(){
		try {
            Scanner input = new Scanner(new File("Dibujo.txt"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                for(int i=0;i<100;i++){
                switch(line.substring(i,i+1)){
                	case "0":System.out.print(" ");
                			break;
                	case "1":System.out.print("_");
                			break;
                	case "2":System.out.print("|");
                			break;
                	case "3":System.out.print("\\");
                			break;
                	case "4":System.out.print("/");
                			break;
                	case "5":System.out.print("-");
                			break;
                	case "6":System.out.print(">");
                			break;
                	case "7":System.out.print("<");
                			break;
                	case "8":System.out.print("(");
                			break;
                	case "9":System.out.print(")");
                			break;
                	case "a":System.out.print("*");
                			break;
                	case "b":System.out.print(".");
                			break;
                	case "c":System.out.print("@");
                			break;
                }
                }
                System.out.println();
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}