import java.util.Scanner;

public class Ex3A {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String sexo;
		
		
		System.out.println("Digite o nome do ind�viduo :  ");
		nome = sc.next();
		
		System.out.println("Digite o sexo do ind�viduo :  ");
		sexo = sc.next();
		
		if(sexo == "Feminino") {
			System.out.println("Ilma Sra.  " + nome);
		}
		else if (sexo == "Masculino"){
			System.out.println("Ilmo. Sr.  " + nome);
		}
		else {
			System.out.println("Digite o sexo v�lido");
		}
	}
	
}

