
class Verzweigung {

	public static void main(String[] args) {
		int rest = 5 % 5;

		int zahl = 6;

		boolean istFuenf = (zahl == 5);

		if (istFuenf) {
			System.out.println("Das ist die 5!");
		} else if (zahl == 6) {
			System.out.println("Das ist die 6!");
		} else {
			System.out.println("Das ist nicht die 5!");
		}

		switch (zahl) {
		case 5: {
			System.out.println("Das ist die 5!");
			break;
		}
		case 6: {
			System.out.println("Das ist die 6!");
			break;
		}
		default:
			System.out.println("Das ist nicht die 5!");
		}

	}

}
