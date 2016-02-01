package NameSelection;

import java.util.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;

public class SelectGender {

	public static void main(String[] args) {
		try(Scanner user_input = new Scanner(System.in)){	
			System.out.println("Choose gender: (b)oy or (g)irl?");
			String gender = user_input.nextLine();
			System.out.println("Choose method: (r)andom or (n)ormal?");
			String method = user_input.nextLine();
			DecideRandNorm(method, gender);
		}
	}
	
	public static Path FileInput (String gender){
		Path fileName=null;
		//work on directories!!
		Path nameBoy = Paths.get("/Names/", "NameBoy.txt");
	    Path nameGirl = Paths.get("/Names/", "NameGirl.txt");
	    
	    	if (gender.equals("b") || gender.equals("boy")) {
				fileName = nameBoy;
		    }
		    else if (gender.equals("g") || gender.equals("girl")) {
				fileName = nameGirl;
		    }
		    else
		    //need to work on that as well
		    	System.out.println("Error");
		
	    ReadLines(fileName);
	    return fileName;
	}
	

	public static List<String> ReadLines (Path fileName){
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

	public static String DecideRandNorm(String methodChosen, String gender){
		String method = null;
		FileInput(gender);
		
		if (methodChosen.equals("r") || methodChosen.equals("random")){
			RandomName.NameRandom(ReadLines(FileInput(gender)));
		}
		else if (methodChosen.equals("n") || methodChosen.equals("normal")){
			ChooseName.NameSelector(ReadLines(FileInput(gender)));
		}
		else
			System.out.println("Error");
		return method;
	}
	
}
