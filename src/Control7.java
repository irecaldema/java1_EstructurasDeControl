/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;//importa librerias
public class Control7 {//crea clase
    public static void main(String[] args) {//inicia ejecucion
      Scanner sc = new Scanner(System.in);//crea objeto scanner
      double nota;//declara variable
      System.out.println("Introduzca una nota entre 0 y 10: ");//muestra mensaje
      nota = sc.nextDouble();//escanea entrada
      System.out.println("La calificación del alumno es ");//muestra mensaje
      if(nota < 0 || nota > 10)//si la variable es menor a 0 o es mayor a 10
         System.out.println("Nota no válida");//muestra mensaje
      else if(nota==10)//si no se cumple la condicion pero la variable es igual a 10
           System.out.println("Matrícula de Honor");//muestra mensaje
      else if (nota >= 9)//si no se cumple la condicion pero la variable es mayor o igual a 9
           System.out.println("Sobresaliente");//muestra mensaje
      else if (nota >= 7)//si no se cumple la condicion pero la variable es mayor o igual a 7
           System.out.println("Notable");//muestra mensaje
      else if (nota >= 6)//si no se cumple la condicion pero la variable es mayor o igual a 6
           System.out.println("Bien");//muestra mensaje
      else if (nota >= 5)//si no se cumple la condicion pero la variable es mayor o igual a 5
           System.out.println("Suficiente");//muestra mensaje
      else//si no se cumplen las condiciones
           System.out.println("Suspenso");//muestra mensaje
    }
}
