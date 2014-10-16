/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
//importa librerias
import java.util.*;
//crea clase
public class Control14 {
    //inicia ejecucion
    public static void main(String[] args) {
	//declara variable
        int valor;
	//crea objeto escaner
        Scanner in = new Scanner( System.in );
	//bucle do while
        do {
	    //muestra mensaje
            System.out.print("Escribe un entero < 100: ");
	    //escanea la numero de la entrada
            valor = in.nextInt();
	//condicion del bucle, cuando el valor sea mayor o igual a 100
        }while (valor >= 100);
	//muestra mensaje
        System.out.println("Ha introducido: " + valor);
    }
}
