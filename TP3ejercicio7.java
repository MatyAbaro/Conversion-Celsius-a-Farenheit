public class CelsiusOnFarenheit {

    public static void main(String[] args) {
              Scanner entrada = new Scanner (System.in);
              float grados, resultado;
              boolean repetir = true;
        do{      
           System.out.println("Ingrese los grados Celsius:");
           try{
               grados=entrada.nextFloat();
               repetir = false;
               resultado= 32 + (9*grados/5);//Cálculo matemático para la conversión.
               System.out.println("La conversion de "+grados+ " grados "+ " a grados farenheit es: "+resultado);
               System.out.println("---FIN DEL PROGRAMITA---");          
           }
           catch (Exception e){  //Catch de posible error de introducir char, Strings o Double con punto en lugar de utilizar una coma (,).
               entrada.nextLine();
            System.out.println("---ERROR, INGRESA DATOS VÁLIDOS!!---");
               
           }
        } while (repetir);
  
        
    }
    
}

