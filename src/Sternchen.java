

public class Sternchen {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < 30; i++) {
			builder.append("*");
		}
		System.out.println(builder.toString());

		for (int i = 0; i < 30; i++) {
			System.out.print("*");
		}
	}

}
