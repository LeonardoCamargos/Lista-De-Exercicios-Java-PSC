
public class Ex1F {

	 public static void main(String[] args) 
	 {// Inicio do m�todo main
	     
	     String total=""; /* Variavel que receber� todos os n�meros divis�veis 
	                       * por 4 menores que 200 */
	     
	     int i;           // Vari�vel que contar� at� 200
	     
	     for(i=1;i<200;i++) // Contar� desde 1 at� 199
	     {// Inicio do la�o FOR
	        if(i%4==0) /* S� passar� o n�mero em que o resto da divis�o com 4 
	                    * for igual a 0 */
	        	
	        total+=i+","; /* Receber� os n�meros que forem divis�veis por 4 e 
	                       * joga uma v�rgula depois do n�mero */
	     }// Fim do la�o FOR
	     // Apresentar� os n�meros divis�veis por 4 menores que 200
	     System.out.printf(total,"RESULTADO");
	          
	 }// Fim do metodo main
	
	
}






