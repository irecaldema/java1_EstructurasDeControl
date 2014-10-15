/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;//importa librerias
import java.io.*;//importa librerias
public class Control9 {//crea clase
    public static void main(String[] args) throws IOException{ //inicia ejecucion *********************
        int A,B, Resultado = 0 ;//declara e inicializa variables
        char operador;//declara variable
        boolean calculado = true;//declara e inicializa varible
        Scanner sc = new Scanner(System.in);//crea objeto scanner
        System.out.print("Introduzca un numero entero:");//muestra mensaje
        A = sc.nextInt();//escanea entrada
        System.out.print("Introduzca otro numero entero:");//muestra mensaje
        B = sc.nextInt();//escanea entrada
        System.out.print("Introduzca un operador (+,-,*,/):");//muestra mensaje
        operador = (char)System.in.read();//escanea entrada y agarra el caracter
        switch (operador) {//si la varioable
                case '-' : Resultado = A - B;//es - hace una resta
                           break;//sale
                case '+' : Resultado = A + B;//es + hace una suma
                           break;//sale
                case '*' : Resultado = A * B;//es * hace una multiplicacion 
                           break;//sale
                case '/' : if(B!=0)//es / y la segunda variable es diferente a 0
                              Resultado = A / B; //hace una division
                           else{ //si no se cumple la condicion
                              System.out.println("\nNo se puede dividir por cero");//muestra mensaje
                              calculado = false;//guarda valor en variable
                           }
                           break;//sale
                default : System.out.println("\nOperador no valido");//es diferente a los otros casos muestra mensaje
                          calculado = false;//guarda valor en variable
                         
        }
        if(calculado){//si la 
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
