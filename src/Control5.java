/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;//importa librerias
public class Control5 {//crea clase
    public static void main(String[] args) {//inicia ejecucion
        Scanner sc = new Scanner(System.in);//crea objeto scanner
        int num;      //declara variable
        System.out.println("Introduzca numero: ");//muestra mensaje
        num = sc.nextInt();//escanea numero
        if ((num%2)==0)//si el resto del numero entre 2 es igual a 0
           System.out.println("PAR"); //muestra mensaje
        else//Cuando no cumple la condicion
            System.out.println("IMPAR");//muestra mensaje
    }
}
