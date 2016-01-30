package NameSelection;

import java.util.List;

public class RandomName {
	
	public static String RandomName (List<String> NamesList){
		String TheName = null;
		Integer randomNum = 0 + (int)(Math.random() * NamesList.size()); 
		
		TheName = NamesList.get(randomNum);
		
		return TheName;
	}
}
