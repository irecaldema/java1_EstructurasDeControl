/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
//crea clase
public class Control18 {ç
    //inicia ejecucion
    public static void main(String[] args) {
	//declara e inicializa variables
        final int VALOR_INICIAL = 10; // limite inf. tabla
        final int VALOR_FINAL = 100; // limite sup. tabla
        final int PASO = 10 ; // incremento
        int fahrenheit;
        double celsius;
	//guarda en varible el valor de otra variable
        fahrenheit = VALOR_INICIAL;
	//muestra mensaje con tabulacion y salto de linea
        System.out.printf("Fahrenheit \t Celsius \n");
	//bucle for (inicializacion; copndicion repetir(cuando fahrenheit sea menor o igual a 100); cada repeticion fahrenheit se suma paso)
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
	     //calculo del valor celsius equivalente a valor en fahrenheit
             celsius = 5*(fahrenheit - 32)/9.0;
	     //muestra mensaje con formato de 7digitos decimal tabulacion 8digitos.3digitos float(punto flotante) salto de linea
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
