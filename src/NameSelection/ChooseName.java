package NameSelection;

import java.util.*;

public class ChooseName {
	
	public static String nameSelector(List<String> namesList){
		String theName = null;
		
		try(Scanner userInput = new Scanner(System.in)){
			System.out.println("Which name you like better?");
			int i = 0;	
			
			while (namesList.size()>1){
				if (i<namesList.size()){
					System.out.println("(1)" + namesList.get(i));
					System.out.println("(2)" + namesList.get(i+1));
					
					String pickName = userInput.nextLine();
					
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


//for (String line : NamesList) {
//	System.out.println(line);
//    }
