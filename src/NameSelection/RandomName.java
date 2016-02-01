package NameSelection;

import java.util.List;

public class RandomName {
	
	public static String nameRandom (List<String> namesList){
		String theName = null;
		Integer randomNum = 0 + (int)(Math.random() * namesList.size()); 
			
		theName = namesList.get(randomNum);
			
		System.out.println(theName);
			
		return theName;
	}
}