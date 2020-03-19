package celsiusonfarenheit;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CelsiusOnFarenheit {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
              float grados, resultado;
              boolean repetir = true;
        do{      
           //System.out.println("Ingrese los grados Celsius:");
           
           try{
               //grados=entrada.nextFloat();
               grados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los datos Celsuis:"));
               repetir = false;
               resultado= 32 + (9*grados/5);//Cálculo matemático para la conversión.
               //System.out.println("La conversion de "+grados+ " grados "+ " a grados farenheit es: "+resultado);
               //System.out.println("---FIN DEL PROGRAMITA---");          
               JOptionPane.showMessageDialog(null,"La conversion de "+grados+ " grados "+ " a grados farenheit es: "+resultado );
               JOptionPane.showMessageDialog(null,"FIN DEL PROGRAMITA");
           }
           catch (Exception e){  //Catch de posible error de introducir char, Strings o Double con punto en lugar de utilizar una coma (,).
               //entrada.nextLine();
            //System.out.println("---ERROR, INGRESA DATOS VÁLIDOS!!---");
            JOptionPane.showMessageDialog(null,"---ERROR, INGRESA DATOS VÁLIDOS!!---");
               
           }
        } while (repetir);
  
        
    }
    
    }
    

