/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*; //importacion de librerias
public class Control3 { //creacion de la clase
    public static void main( String[] args ){ //inicio de ejecucion
        Scanner sc = new Scanner( System.in ); //crea objeto scaner
        System.out.print("Nota: "); //muestra mensaje
        int nota = sc.nextInt(); //se introduce numero
        if (nota >= 5 ){ //si la nota es mayor o igual a 5
            System.out.println("Enorabuena!!"); //muestra mensaje
            System.out.println("Has aprobado"); //muestra mensaje
        }
    }
}
