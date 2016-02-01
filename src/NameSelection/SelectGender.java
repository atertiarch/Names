package NameSelection;

import java.util.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;

public class SelectGender {

	public static void main(String[] args) {
		try(Scanner userInput = new Scanner(System.in)){	
			System.out.println("Choose gender: (b)oy or (g)irl?");
			String gender = userInput.nextLine();
			System.out.println("Choose method: (r)andom or (n)ormal?");
			String method = userInput.nextLine();
			decideRandNorm(method, gender);
		}
	}
	
<<<<<<< HEAD
	public static Path FileInput (String gender){
		Path fileName=null;
		//work on directories!!
		Path nameBoy = Paths.get("/Names/", "NameBoy.txt");
	    Path nameGirl = Paths.get("/Names/", "NameGirl.txt");
=======
	public static Path fileInput (String gender){
		Path fileName=null;
		//work on directories!!
		Path nameBoy = Paths.get("", "NameBoy.txt");
	    Path nameGirl = Paths.get("", "NameGirl.txt");
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
	    
	    	if (gender.equals("b") || gender.equals("boy")) {
				fileName = nameBoy;
		    }
		    else if (gender.equals("g") || gender.equals("girl")) {
				fileName = nameGirl;
		    }
		    else
		    //need to work on that as well
		    	System.out.println("Error");
		
<<<<<<< HEAD
	    ReadLines(fileName);
=======
	    readLines(fileName);
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
	    return fileName;
	}
	

<<<<<<< HEAD
	public static List<String> ReadLines (Path fileName){
=======
	public static List<String> readLines (Path fileName){
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
		List<String> namesList = null;
		Charset charset = Charset.forName("ISO-8859-1");
		
		try {
			namesList = Files.readAllLines(fileName, charset);
		}
		catch (IOException e) {
  	      	System.out.println("Error: " + e);
		}
	    
		return namesList;
	}

<<<<<<< HEAD
	public static String DecideRandNorm(String methodChosen, String gender){
=======
	public static String decideRandNorm(String methodChosen, String gender){
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
		String method = null;
		fileInput(gender);
		
		if (methodChosen.equals("r") || methodChosen.equals("random")){
<<<<<<< HEAD
			RandomName.NameRandom(ReadLines(FileInput(gender)));
		}
		else if (methodChosen.equals("n") || methodChosen.equals("normal")){
			ChooseName.NameSelector(ReadLines(FileInput(gender)));
=======
			RandomName.nameRandom(readLines(fileInput(gender)));
		}
		else if (methodChosen.equals("n") || methodChosen.equals("normal")){
			ChooseName.nameSelector(readLines(fileInput(gender)));
>>>>>>> 79301020c60657e6d57ffa06488aa32677b792a4
		}
		else
			System.out.println("Error");
		return method;
	}
	
}
