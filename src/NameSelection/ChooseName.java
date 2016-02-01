package NameSelection;

import java.util.*;

public class ChooseName {
	
<<<<<<< HEAD
	public static String NameSelector(List<String> namesList){
=======
	public static String nameSelector(List<String> namesList){
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
		String theName = null;
		
		try(Scanner userInput = new Scanner(System.in)){
			System.out.println("Which name you like better?");
			int i = 0;	
			
			while (namesList.size()>1){
<<<<<<< HEAD
				if (i+1<namesList.size()){
					System.out.println("(1)" + namesList.get(i));
					System.out.println("(2)" + namesList.get(i+1));
					
					String pickName = user_input.nextLine();
=======
				if (i<namesList.size()){
					System.out.println("(1)" + namesList.get(i));
					System.out.println("(2)" + namesList.get(i+1));
					
					String pickName = userInput.nextLine();
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
					
					if (pickName.equals("1")){
						namesList.remove(i+1);
						i++;
					}
					else if (pickName.equals("2")){
						namesList.remove(i);
						i++;
					}	
				}
				else 
					i=0;
			}
			
			System.out.println("The winner name is: " + namesList.get(0));
		}
		return theName;
	}
}