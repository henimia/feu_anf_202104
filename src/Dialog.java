import java.util.Scanner;

/**
 * Eine Dialog-Anwendung.
 * 
 * @author micha
 */
class Dialog {

	/**
	 * Startet die Anwendung.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bitte Namen eingeben!");

		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		System.out.println("Hallo, " + name);
		scanner.close();
	}

}
