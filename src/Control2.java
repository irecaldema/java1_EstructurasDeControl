/*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*; //importar librerias
public class Control2 { //crear clase
    public static void main(String[] args){ //inicio de ejecucion
        Scanner sc = new Scanner(System.in); //objeto escaner
        double numero1, numero2; //declarar variables
        System.out.println("Introduce el primer número:"); //mostrar mensaje
        numero1 = sc.nextDouble(); //escaneo de la entrada
        System.out.println("Introduce el segundo número:"); //mostrar mensaje
        numero2 = sc.nextDouble();//escaneo de la entrada
        System.out.println("Números introducido: " + numero1 + "  " + numero2); //muestra los numeros tecleados
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2)); //muestra la suma de los numeros
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2)); //muestra la resta de los numeros
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2); //muestra la multiplicacion de los numeros
    }
}
