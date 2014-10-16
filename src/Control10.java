 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;//importa librerias
public class Control10 {//crea clase	
    public static void main(String[] args) {//inicia ejecucion
        Scanner sc = new Scanner(System.in);//crea objeto scanner
        int num;      //declara variable
        System.out.println("Introduzca numero: ");//muestra mensaje
        num = sc.nextInt();//escanea entrada
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");//condicion expresion1 ? Expresion2 : Expresion3, si la condicion es verdadera se ejecuta la espresion1 si es falsa la expresion2
    }//se cierra la ejecucion
}//se cierra la clase
