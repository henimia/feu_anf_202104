import java.util.Scanner;

class GeradeOderUngerade {

	public static void main(String[] args) {
		System.out.println("Gib die erste Zahl ein.");
		Scanner scanner = new Scanner(System.in);
		try {
			int zahl1 = scanner.nextInt();

			boolean istGerade = zahl1 % 2 == 0;
			boolean istGross = zahl1 > 2000;

			if (istGerade && !istGross) {
				System.out.println("Die Zahl ist gerade, aber nicht groﬂ.");
			} else if (istGross) {
				System.out.println("Die Zahl ist groﬂ");
			} else {
				System.out.println("Die Zahl ist ungerade.");
			}
		} finally {
			scanner.close();
		}
	}

}
