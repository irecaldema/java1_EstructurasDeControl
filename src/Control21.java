/*
 * Programa que muestra una tabla con las potencias de x (x x2 x3 x4)
 * para valores de x desde 1 hasta XMAX
 */
//crea clase
public class Control21 {
    //inicia ejecucion
    public static void main(String[] args) {
	//declara e inicializa variables
        final int XMAX = 10;
        int x, n;
        //mostrar la cabecera de la tabla con formato 10 digitos s--> to strring n-->salto de linea
        System.out.printf("%10s%10s%10s%10s%n", "x","x^2","x^3","x^4");
	//bucle for (inicializacion;condicion a repetir (cuando x sea menor o igual a 4);cambio en variable por repeticion)
        for (x = 1; x <= XMAX; x++){   //filas
	     ////bucle for (inicializacion;condicion a repetir (cuando n sea menor o igual a 4);cambio en variable por repeticion)
             for (n = 1; n <= 4; n++){   //columnas
		  //muestra mensaje con formato 10 digitos . 0 digitos en formato float, clase Math metodo pow de power pow(x,n)--> x elevado a n
                  System.out.printf("%10.0f", Math.pow(x,n));
             }
	     //muestra salto de linea
             System.out.println();
        }
    }
}
