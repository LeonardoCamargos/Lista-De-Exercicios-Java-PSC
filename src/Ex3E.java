import java.util.Scanner;

public class Ex3E {

	public static void main(String args[]) 
	{
	Scanner input = new Scanner(System.in);
	
	double real;  // valor da con vers�o de d�lar para real
	double dolar;  // quantidade em d� lares do usu�rio
	double cotacao ; // cota��o do d�lar
	
	System.out.print("Digite a quantidade em dolar:" );
	dolar = input.nextDouble();
	
	System.out.print("Digite a cota��o do dolar:" );
	cotacao = input.nextDouble();
	
	real = dolar * cotacao;
	System.out.printf ("Quantia em reais: " +real+ " R$");   
	
	}
	
	}
