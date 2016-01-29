package NameSelection;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.io.IOException;
import java.lang.reflect.Array;



public class SelectName {

	public static void main(String[] args) {
		try(Scanner user_input = new Scanner(System.in)){	
			System.out.println("Choose gender? (b)oy or (g)irl?");
			String gender = user_input.nextLine();
			
			FileInput(gender);
		} 
	}
	
	public static List<String> FileInput (String gender){
		Path FileName=null;
		Path NameBoy = Paths.get("NameBoy.txt");
	    Path NameGirl = Paths.get("NameGirl.txt");
	    Charset charset = Charset.forName("ISO-8859-1");

	    
	    List<String> lines = null;
	    
	    if (gender.equals("b")) {
			System.out.println("TEST2");
			FileName = NameBoy;
	    }
	    else if (gender.equals("g")) {
			System.out.println("TEST3");
			FileName = NameGirl;
	    }
	    else
	    	System.out.println("Ani me ani be");
	    
	    try {
	    	lines = Files.readAllLines(FileName, charset);
	    	for (String line : lines) {
	    		System.out.println(line);
	    	    }
	    	
	    } catch (IOException e) {
	    	      System.out.println(e);
	    	}
	    
	    
	    return lines;
	}
	
	

}
