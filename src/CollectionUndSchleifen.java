import java.util.Iterator;
import java.util.LinkedList;

public class CollectionUndSchleifen {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add("Petra");
		names.add("Werner");
		names.add("Fabian");
		names.add("Katharina");
		names.add("Julian");
		System.out.println("######## For-Schleife:");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

//		eher unüblich
//		int i = 0;
//		while (i < names.size()) {
//			System.out.println(names.get(i));
//			i++;
//		}

		System.out.println("######## While-Schleife:");
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("######## Foreach-Schleife:");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("######## doWhile-Schleife:");
		Iterator<String> it2 = names.iterator();
		do {
			System.out.println(it2.next());
		} while (it2.hasNext());
	}

}
