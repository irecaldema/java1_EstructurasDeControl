/*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
//importa librerias
import java.util.*;
//crea clase
public class Control20 {
    //inicia ejecucion
    public static void main(String[] args) {
	//crea objeto escaner
        Scanner sc = new Scanner(System.in);
	//declara variables
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
	//bucle do while
        do{
	   //muestra mensaje
           System.out.print("Introduce número de filas: ");
	   //escanea entrada de numero
           filas = sc.nextInt();
	//condicion a repetir (cuando filas sea menor a 1)
        }while(filas<1);
        //leer número de columnas hasta que sea un número > 0
	//bucle do while
        do{
	   //muestra mensaje
           System.out.print("Introduce número de columnas: ");
	   //escanea entrada de numero
           columnas = sc.nextInt();
	//condicion a repetir (cuando columnas sea menor a 1)
        }while(columnas<1);
	//bucle for (declaracion e inicializacion; condicion a repetir (cuando i sea menor o igual a filas);cambio por cada repeticion)
        for(int i = 1; i<=filas; i++){    //filas
            for(int j = 1; j<=columnas; j++){   //columnas
		 //muestra mensaje
                 System.out.print(" * ");
            }
	    //muestra mensaje "vacio" con salto de linea
            System.out.println();
        }
       
    }
}
