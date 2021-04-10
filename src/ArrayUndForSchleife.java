
public class ArrayUndForSchleife {

	public static void main(String[] args) {
		String[] names = new String[] { "Peter", "Frauke", "Sandra" };

		for (int i = 0; i < names.length; i++) {
			System.out.println("Platz " + (i + 1) + ": " + names[i]);
		}

	}
}
