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
		Path FileName=null;
		//work on directories!!
		Path NameBoy = Paths.get("c:/Users/Ewa/workspace_eclipse/Names/src/Names/", "NameBoy.txt");
	    Path NameGirl = Paths.get("c:/Users/Ewa/workspace_eclipse/Names/src/Names/", "NameGirl.txt");
	    
	    	if (gender.equals("b") || gender.equals("boy")) {
				FileName = NameBoy;
		    }
		    else if (gender.equals("g") || gender.equals("girl")) {
				FileName = NameGirl;
		    }
		    else
		    //need to work on that as well
		    	System.out.println("Ani to ani sio");
		
	    ReadLines(FileName);
	    return FileName;
	}
	

	public static List<String> ReadLines (Path FileName){
		List<String> NamesList = null;
		Charset charset = Charset.forName("ISO-8859-1");
		
		try {
			NamesList = Files.readAllLines(FileName, charset);
		}
		catch (IOException e) {
  	      	System.out.println("Error: " + e);
		}
	    
		return NamesList;
	}

	public static String DecideRandNorm(String MethodChosen, String gender){
		String method = null;
		FileInput(gender);
		
		if (MethodChosen.equals("r") || MethodChosen.equals("random")){
			RandomName.NameRandom(ReadLines(FileInput(gender)));
		}
		else if (MethodChosen.equals("n") || MethodChosen.equals("normal")){
			ChooseName.NameSelector(ReadLines(FileInput(gender)));
		}
		else
			System.out.println("Error");
		return method;
	}
	
}
