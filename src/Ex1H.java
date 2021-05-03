import java.util.Scanner;

public class Ex1H {

	public static void main(String[] args) {
		int i = 1;
		int base = 1;
		int expoente = 1;
		int resultado = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base:  ");
		base = sc.nextInt();
		
		System.out.println("Digite o valor do expoente:  ");
		expoente = sc.nextInt();
		
		
		
		 for (i = 1; i <= expoente; i++){
	            resultado = resultado * base;
	      }
		 
		 
		 System.out.printf("\n\nResposta: %d elevado a %d = %d", base, expoente, resultado);
	}
	
	
}