public class Ex1A {

	public static void main(String args[]) {
		int i, quad;// Declara as variáveis i (contador de looping) e quad(Que receberá os quadrados
					// de i)
		for (i = 15; i <= 200; i++) // contador para variar i de 15 até 200
		{
			quad = i * i; // quad recebe o valor de i ao quadrado
			System.out.println("O quadrado de " + i + " é " + quad); // imprime os quadrados
		}
	}

}
