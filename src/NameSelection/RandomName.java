package NameSelection;

import java.util.List;

public class RandomName {
	
<<<<<<< HEAD
	public static String NameRandom (List<String> namesList){
=======
	public static String nameRandom (List<String> namesList){
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
		String theName = null;
		Integer randomNum = 0 + (int)(Math.random() * namesList.size()); 
			
		theName = namesList.get(randomNum);
			
		System.out.println(theName);
			
		return theName;
	}
}