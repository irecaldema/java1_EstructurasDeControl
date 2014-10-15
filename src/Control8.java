/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;//importa librerias
public class Control8 {//crea clase
    public static void main(String[] args) {//inicia ejecucion
        int mes;//declara variable
        Scanner sc = new Scanner(System.in);//crea objeto scanner
        System.out.print("Introduzca un numero de mes: ");//muestra mensaje
        mes = sc.nextInt();//escanea entrada
        switch (mes)//si la variable
        {
                case 1: System.out.println("ENERO");//es 1 muestra mensaje
                           break;//sale
                case 2: System.out.println("FEBRERO");//es 2 muestra mensaje
                           break;//sale
                case 3: System.out.println("MARZO");//es 3 muestra mensaje
                           break;//sale
                case 4: System.out.println("ABRIL");//es 4 muestra mensaje
                           break;//sale
                case 5: System.out.println("MAYO");//es 5 muestra mensaje
                           break;//sale
                case 6: System.out.println("JUNIO");//es 6 muestra mensaje
                           break;//sale
                case 7: System.out.println("JULIO");//es 7 muestra mensaje
                           break;//sale
                case 8: System.out.println("AGOSTO");//es 8 muestra mensaje
                           break;//sale
                case 9: System.out.println("SEPTIEMBRE");//es 9 muestra mensaje
                           break;//sale
                case 10: System.out.println("OCTUBRE");//es 10 muestra mensaje
                             break;//sale
                case 11: System.out.println("NOVIEMBRE");//es 11 muestra mensaje
                             break;//sale
                case 12: System.out.println("DICIEMBRE");//es 12 muestra mensaje
                             break;//sale
                default : System.out.println("Mes no válido");//no es ninguno de los otros casos muestra mensaje (por defecto)                  
        }
    }
}
