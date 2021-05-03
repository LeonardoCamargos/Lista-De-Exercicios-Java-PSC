import java.util.Scanner;

// Programa conversor de temperaturas                    
// ----------------------------------                    
// Este programa converte graus Fahrenheit
// em graus Celsius e vice-versa.
//////////////////////////////////////////

public class Ex1J
{
   static double celsiusParaFahrenheit (double c)
   {
      return 9.0 * c / 5.0 + 32.0;
   }
 
   static double fahrenheitParaCelsius (double f)
   {
      return 5.0 * (f - 32.0) / 9.0;
   }
 
   public static void main (String[] args)
   {
	   
	  Scanner sc = new Scanner(System.in);
      double far, cel;
      
      System.out.print ("Temperatura em graus Fahrenheit: ");
      far = sc.nextDouble();
      cel = fahrenheitParaCelsius (far);
      System.out.println ("igual a " + cel + " graus Celsius");
     
      System.out.print ("Temperatura em graus Celsius: ");
      cel = sc.nextDouble();
      far = celsiusParaFahrenheit (cel);
      System.out.println ("igual a " + far + " graus Fahrenheit");
   }
}