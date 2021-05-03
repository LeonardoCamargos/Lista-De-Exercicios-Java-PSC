import javax.swing.JOptionPane;

public class Ex1D {

	// Soma numeros Pares de 1 a 500

	public static void main(String[] args) {
		int total = 0;
		int i;
		for (i = 0; i <= 500; i += 2) {
			total += i;
		}
		System.out.printf("Resultado:  " + total);
	}

}
