import java.util.Scanner;

class Rechner {
//	short kleineGanzzahl = 3;
//	int ganzzahl = -5_878_888;
//	long grosseGanzzahl = 1_482_374_364;
//	boolean logisch = true;
//	float gleitpunktzahl = 3.4F;
//	double grosseGleitpunktzahl = 77.9;
//	char buchstabe = 'c';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int zahlEinsAlsInteger = 0;
		System.out.println("Gib erste Zahl ein!");
		String zahlEins = scanner.next();
		try {
			zahlEinsAlsInteger = Integer.valueOf(zahlEins);
		} catch (NumberFormatException numberFormatException) {
			System.out.println("Das war keine Zahl, noch mal bitte!");
			zahlEins = scanner.next();
			zahlEinsAlsInteger = Integer.valueOf(zahlEins);
		}

		int zahlZweiAlsInteger = 0;
		System.out.println("Gib die zweite Zahl ein!");
		String zahlZwei = scanner.next();
		try {
			zahlZweiAlsInteger = Integer.valueOf(zahlZwei);
		} catch (NumberFormatException numberFormatException) {
			System.out.println("Das war keine Zahl, noch mal bitte!");
			zahlZwei = scanner.next();
			zahlZweiAlsInteger = Integer.valueOf(zahlEins);
		}

		int ergebnis = zahlEinsAlsInteger + zahlZweiAlsInteger;
		System.out.println("Ergebnis: " + ergebnis);

		scanner.close();
	}

}
