package cap4;

public class Cap4Laboratorio1 {
	public static void main(String[] args) {
		int numero = 15;
		int divisoes = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				divisoes++;
			}
		}
		if (divisoes <= 2) {
			System.out.println(numero + " � primo");
		} else {
			System.out.println(numero + " n�o � primo");
		}
	}
}
