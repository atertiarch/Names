package NameSelection;

import java.util.*;

public class ChooseName {
	
	public static String NameSelector(List<String> NamesList){
		String TheName = null;
		
		try(Scanner user_input = new Scanner(System.in)){
			System.out.println("Which name you like better?");
			int i = 0;	
			
			while (NamesList.size()>1){
				if (i<NamesList.size()){
					System.out.println("(1)" + NamesList.get(i));
					System.out.println("(2)" + NamesList.get(i+1));
					
					String PickName = user_input.nextLine();
					
					if (PickName.equals("1")){
						NamesList.remove(i+1);
						i++;
					}
					else if (PickName.equals("2")){
						NamesList.remove(i);
						i++;
					}	
				}
				else 
					i=0;
			}
			
			System.out.println("The winner name is: " + NamesList.get(0));
		}
		return TheName;
	}
}


//for (String line : NamesList) {
//	System.out.println(line);
//    }
