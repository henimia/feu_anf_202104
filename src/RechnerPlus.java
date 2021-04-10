import java.util.Scanner;

class RechnerPlus {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			int zahlEinsAlsInteger = getZahl(scanner, "erste");

			int zahlZweiAlsInteger = getZahl(scanner, "zweite");

			int ergebnis = zahlEinsAlsInteger + zahlZweiAlsInteger;
			System.out.println("Ergebnis: " + ergebnis);
		}
	}

	private static int getZahl(Scanner scanner, String position) {
		int zahl = -1;
		while (zahl < 0) {
			System.out.println("Gib " + position + " Zahl ein!");
			String text = scanner.next();
			try {
				zahl = Integer.valueOf(text);
			} catch (NumberFormatException numberFormatException) {
				System.out.println("Das war keine Zahl, noch mal bitte!");
			}
		}
		return zahl;
	}

}
