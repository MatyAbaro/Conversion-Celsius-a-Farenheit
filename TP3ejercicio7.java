
package tp3ejercicio7;

import java.util.Scanner;

public class TP3ejercicio7 {

    public static void main(String[] args) {
       pasarGrados();
    } 
       
    static void pasarGrados(){
       float grados, resultado;
       Scanner entrada = new Scanner(System.in);
    try{
        System.out.println("Ingrese los grados Celsius");
        grados=entrada.nextFloat();
        resultado= 32 + (9*grados/5);
               System.out.println("La conversion de "+grados+ " grados "+ " a grados farenheit es: "+resultado);
               System.out.println("---FIN DEL PROGRAMITA---");
           }
       catch (Exception e){System.out.println("ATENCIóN: Ingrese los grados con coma (,)");
       pasarGrados();
       }
       }
    }
    

