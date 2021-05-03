import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int fatorial;
		int contador =1;
		
		System.out.println("Digite o número para calcular o fatorial: ");
		numero = sc.nextInt();
		
		fatorial = 1;
		
		for(numero = 1; numero >= contador;){
			fatorial = fatorial *contador;
			
		}
		
		System.out.printf("O fatorial de " , numero , "é : ", fatorial);
	}
}


