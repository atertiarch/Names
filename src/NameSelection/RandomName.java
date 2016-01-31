package NameSelection;

import java.util.List;

public class RandomName {
	
	public static String NameRandom (List<String> NamesList){
		String TheName = null;
		Integer randomNum = 0 + (int)(Math.random() * NamesList.size()); 
			
		TheName = NamesList.get(randomNum);
			
		System.out.println(TheName);
			
		return TheName;
	}
}