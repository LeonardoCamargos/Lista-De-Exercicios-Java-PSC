
public class Ex1F {

	 public static void main(String[] args) 
	 {// Inicio do método main
	     
	     String total=""; /* Variavel que receberá todos os números divisíveis 
	                       * por 4 menores que 200 */
	     
	     int i;           // Variável que contará até 200
	     
	     for(i=1;i<200;i++) // Contará desde 1 até 199
	     {// Inicio do laço FOR
	        if(i%4==0) /* Só passará o número em que o resto da divisão com 4 
	                    * for igual a 0 */
	        	
	        total+=i+","; /* Receberá os números que forem divisíveis por 4 e 
	                       * joga uma vírgula depois do número */
	     }// Fim do laço FOR
	     // Apresentará os números divisíveis por 4 menores que 200
	     System.out.printf(total,"RESULTADO");
	          
	 }// Fim do metodo main
	
	
}






