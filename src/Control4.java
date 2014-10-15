/*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;// importa librerias
public class Control4 {//crea clase
    public static void main( String[] args ){//inicia ejecucion
        Scanner sc = new Scanner( System.in );//crea objeto scanner
        System.out.print("Nota: ");//muestra mensaje
        int nota = sc.nextInt();//se introduce un numero
        if (nota >= 5 ){//si el numero es mayor o igual a 5
            System.out.println("Enorabuena!!");//muestra mensaje
            System.out.println("Has aprobado");//muestra mensaje
        }
        else//si no se cumple la condicion
            System.out.println("Lo Siento, has suspendido");//muestra mensaje
    }
}
