/*
 * programa que lee un número n y muestra n asteriscos
 */
//importa librerias
import java.util.*;
//crea clase
public class Control12 {
    //inicia ejecucion
    public static void main(String[] args) {
	//crea objeto escaner
        Scanner sc = new Scanner(System.in);
	//crea e inicializa variables
        int n, contador = 0;
	//muestra mensaje
        System.out.print("Introduce un número: ");
	//escanea entrada
        n = sc.nextInt();
	//bucle while cuando contador es menor a n
        while (contador < n){
		//muestra mensaje
               System.out.println(" * ");
		//suma al contador 1
               contador++;
        }
    }
}
