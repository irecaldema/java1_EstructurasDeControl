/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;// importa librerias
public class Control6 {//crea clase
    public static void main(String[] args) {//inicia ejecucion
      Scanner sc = new Scanner(System.in);//crea objeto scanner
      int hora; //declara variable 
      System.out.println("Introduzca una hora (un valor entero): ");//muestra mensaje
      hora = sc.nextInt();//escanea la entrada
      if (hora >= 0 && hora < 12)//si la variable es mayor o igual a 0 y es menor a 12
          System.out.println("Buenos días");//muestra mensaje
      else if (hora >= 12 && hora < 21)//si no cumple la condicion pero la variable es mayor o igual a 12 y es menor a 21
           System.out.println("Buenas tardes");//muestra mensaje
      else if (hora >= 21 && hora < 24)//si no cumple la condicion pero la variable es mayor o igual a 21 y es menor a 24
            System.out.println("Buenas noches");//muestra mensaje
      else//si no se cumplen las otras condiciones
            System.out.println("Hora no válida");//se muestra mensaje
    }
}
