/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;//importa librerias
public class Control11 {//crea clase
    public static void main(String[] args) {//inicia ejecucion
        int suma = 0, num;//declara e inicializa variables
        Scanner sc = new Scanner(System.in);//crea objeto escaner
        System.out.print("Introduzca un número: ");//muestra el mensaje
        num = sc.nextInt();//escanea numero
        while (num >= 0){//bucle mientras que la variable sea mayor o igual a 0
               suma = suma + num;//suma las variables suma y num
               System.out.print("Introduzca un número: ");//muestra mensaje
               num = sc.nextInt();//escanea numero entero en entrada
        }
        System.out.println("La suma es: " + suma );//muestra mensaje con resultado
    }
}
