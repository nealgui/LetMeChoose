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
			
			if (!input.isEmpty()) {
				items.add(input);
				System.out.println("Added " +input);
				System.out.println("Any more items? (or q to quit)");
			}
			else {
				System.out.println("Please enter something. (or q to quit)");
			}
				input = getItem.nextLine();	
			
			
		}
		getItem.close();
		
		if (items.size() > 0) {
			System.out.println("\nChoosing an item...\n");
			randNum = (int)(Math.random() * items.size());
			result = items.get(randNum);
			System.out.println("Okay, looks like we're going with " +result);
		}
		else {
			System.out.println("You haven't entered any items. Please try again.");
		}
		
		System.out.println("\nEnd of program.");
		
	}

}
