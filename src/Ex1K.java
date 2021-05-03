
public class Ex1K {

	public static void main (String[] args) {
		
		int CONT,CONT_FATORIAL = 0,FATORIAL = 0;
		
		CONT = 1;
		
		while(CONT <= 10) {
			
			CONT_FATORIAL =1;
			FATORIAL = 1 ;
		}
		while(CONT_FATORIAL <= CONT) {
			
		FATORIAL = FATORIAL * CONT_FATORIAL; 
		CONT_FATORIAL = CONT_FATORIAL + 1;
		
	}
	
	System.out.printf("O fatorial  de  " ,CONT, " é : " ,FATORIAL);
	CONT = CONT + 2;

	}
}

