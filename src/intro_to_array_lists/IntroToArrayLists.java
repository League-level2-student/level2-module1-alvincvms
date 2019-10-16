package intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> S = new ArrayList<String>();
		//2. Add five Strings to your list
		S.add("Ada");
		S.add("Becca");
		S.add("Charlie");
		S.add("Darryl");
		S.add("Evan");
		//3. Print all the Strings using a standard for-loop
		for(String i : S) {
			System.out.println(i);
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("\n");
		for(int i = 0; i < S.size(); i++) {
			System.out.println(S.get(i));
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("\n");
		for(int i = 0; i < S.size(); i++) {
			if(i%2 == 0) {
				System.out.println(S.get(i));
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = S.size() - 1; i >= 0; i--) {
			System.out.println(S.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		System.out.println("\n");
		for(String i : S) {
			if(i.toLowerCase().contains("e")) {
				System.out.println(i);
			}
		}
	}
}
