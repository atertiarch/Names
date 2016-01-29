package NameSelection;
import java.util.*;

public class SelectName {

	public static void main(String[] args) {
		try(Scanner user_input = new Scanner(System.in)){	
			System.out.println("Choose gender? (b)oy or (g)irl?");
			String gender = user_input.nextLine();
			System.out.println(gender);
		} 
	}

	
}
