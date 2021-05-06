package nov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class zad9_1 {

	public static void main(String[] args) throws Exception {
	
		File file = new File("src/nov/zad8_1.java");
		
		zad9_1.VowelsCounter(file);
		
	}

	
	
	public static void VowelsCounter(File file) throws Exception {
		int countV = 0; int countC = 0;
		Character[] vowels = {'A', 'O', 'E', 'U', 'I', 'a', 'o', 'e', 'u', 'i'};
		Set<Character> vowelsSet = new HashSet<Character>(Arrays.asList(vowels)); 
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		int c = 0;
		
		try {
			while((c = br.read()) != -1) {
				char character  = (char)c;
			if(character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
				if(vowelsSet.contains(character)) {
					countV ++;
				}
				else {
					countC++;
				}
			}
		}
			System.out.println("Vowels: " + countV + " Cons.: " + countC);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
