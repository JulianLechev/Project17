package project17;

import java.util.Arrays;
import java.util.ArrayList;

public class Videogame {
	Developer dev;
	String name;
	ArrayList<Character> characters;
	
	
	Videogame(){
		characters = new ArrayList<Character>(Arrays.asList(
				new Character("a"), 
				new Character("b"), 
				new Character("c")));
		
	}
	
	
}
