package NameSelection;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.Charset;
//import java.io.IOError;
import java.io.IOException;

public class SelectGender {

	public static void main(String[] args) {
		try(Scanner user_input = new Scanner(System.in)){	
			System.out.println("Choose gender? (b)oy or (g)irl?");
			String gender = user_input.nextLine();
			FileInput(gender);
			
		} 
	}
	
	public static Path FileInput (String gender){
		Path FileName=null;
		Path NameBoy = Paths.get("c:/Users/Ewa/workspace_eclipse/Names/src/Names/", "NameBoy.txt");
	    Path NameGirl = Paths.get("c:/Users/Ewa/workspace_eclipse/Names/src/Names/", "NameGirl.txt");
	    
	    	if (gender.equals("b")||gender.equals("boy")) {
				FileName = NameBoy;
		    }
		    else if (gender.equals("g")||gender.equals("girl")) {
				FileName = NameGirl;
		    }
		    else
		    	System.out.println("Ani me ani be");
	    	
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
		
		for (String line : NamesList) {
    		System.out.println(line);
    	    }
		
		return NamesList;
	}

}
