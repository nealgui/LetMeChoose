import java.util.*;
//import java.lang.Math;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Let me choose where to go!");
		ArrayList<String> items = new ArrayList<String>();
		Scanner getItem = new Scanner(System.in);
		String result;
		String input;
		int randNum;
		
		System.out.println("Enter some items.");
		input = getItem.nextLine();
		
		while (!"q".equals(input)) {
			items.add(input);
			System.out.println("Added " +input);
			System.out.println("Any more items? (or q to quit)");
			input = getItem.nextLine();
		}
		getItem.close();
		
		randNum = (int)(Math.random() * items.size());
		result = items.get(randNum);
		System.out.println("Okay, looks like we're going with " +result);
	}

}
