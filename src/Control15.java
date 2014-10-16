/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
//importa librerias
import java.util.*;
//crea clase
public class Control15 {
    //inicia eejcucion
    public static void main(String[] args) {
	//declara variable
        int n;
	//crea objeto escaner
        Scanner sc = new Scanner( System.in );
	//bucle do while
        do {
	    //muestra mensaje
            System.out.print("Escribe un número entre 1 y 10: ");
	    //escanea numero de entrada
            n = sc.nextInt();
	//condicion bucle, repeticion cuando la variable sea menor a 1 o mayor a 10
        }while (n<1 || n >10);
	//muestra mensaje
        System.out.println("Ha introducido: " + n);
    }
}
