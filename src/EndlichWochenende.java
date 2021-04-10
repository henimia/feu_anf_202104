import java.util.Scanner;

class EndlichWochenende {

	public static void main(String[] args) {
		System.out.println("Wenn Du mir den Wochentag sagst, " //
				+ "sag ich Dir die Anzahl Tage bis Samstag.");

		try (Scanner scanner = new Scanner(System.in)) {

			String wochentag = scanner.next();

			switch (wochentag.charAt(0)) {
			case 'm':
				System.out.println("Noch 5 Tage.");
				break;
			case 'd':
				System.out.println("Noch 4 Tage.");
				break;
			case 'i':
				System.out.println("Noch 3 Tage.");
				break;
			case 'o':
				System.out.println("Noch 2 Tage.");
				break;
			case 'f':
				System.out.println("Noch 1 Tag.");
				break;
			default:
				System.out.println("Ist schon Wochende!");
				break;
			}
		}
	}

}
