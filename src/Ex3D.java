import java.util.Scanner;

public class Ex3D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A , B , C , resultado;
		
		System.out.println("Digite o valor de A:  ");
		A = sc.nextInt();
		
		System.out.println("Digite o valor de B:  ");
		B = sc.nextInt();
		
		System.out.println("Digite o valor de C:  ");
		C = sc.nextInt();
		

		resultado = A*A + B*B + C*C;
		
		System.out.printf("Resultado: %d", resultado);
		
	}
	
}
