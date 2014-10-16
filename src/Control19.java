/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
//crea clase
public class Control19 {
    //inicia ejecucion
    public static void main(String[] args) {
	//declara variables
        int a, b;
	//bucle for (inicializaciones; condicion repetir(cuando la suma entre a y b sea menor a 10); cambio de valor cada repeticion a = a+1 y b= b+2)
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
            //muestra mensaje
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
