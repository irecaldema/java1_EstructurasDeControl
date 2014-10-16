/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//crea clase
public class Control13 {
    //inicia ejecucion
    public static void main(String[] args) {
	//declara e inicializa variables
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
	//guarda valor en variable
        fahrenheit = VALOR_INICIAL;
	//muestra mensaje \t = tabulacion \n = salto de linea
        System.out.printf("Fahrenheit \t Celsius \n");
	//buclea while mientras que fahrenheit se menor o igual a valor_final 
        while (fahrenheit <= VALOR_FINAL ){
		//calcula el equivalente en celsius el valor de fahrenheit
               celsius = 5*(fahrenheit - 32)/9.0;
		//muestra mensaje con formato especifico --> printf("formato", mensaje) <-- el formato es un string
		//http://docs.oracle.com/javase/1.5.0/docs/api/java/util/Formatter.html#syntax
		//el numero indica la precision(el numero de caracteres numericos que se mostraran antes y o despues del punto)
		// d para formato decimal
		// f para formato float (punto flotante)
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
		//se guarda en la variable la suma con la otra variable
               fahrenheit += PASO;//fahrenheit = fahrenheit + PASO;
        }
    }
}
