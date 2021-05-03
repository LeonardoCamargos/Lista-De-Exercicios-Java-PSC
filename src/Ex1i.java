
public class Ex1i {

	public static void main(String[] args) {
		float n = 0,
		v = 0;

		for (n = 1; n >= 0; n = n + v) {
			v = n - v;
			System.out.printf(" %.0f \n", v);
		}

	}

}
