package nov;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class zad8_2 {

	public static void main(String[] args) {
		Stack<Character> braces = new Stack<>();
		File file = new File("src/nov/Ball.java");
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			int c = 0;
			boolean conflict = false;
			while((c = br.read()) != -1) {
				char character  = (char)c;
				if(character  == '{' || character == '[' || character == '(') {
					braces.add(character);
				} else if(character == '}') {
					conflict = braces.pop() != '{';
				}else if(character == ']') {
					conflict = braces.pop() != '[';
				}else if(character == ')') {
					conflict = braces.pop() != '(';
				}
				if(conflict) {
					break;
				}
			}
			
			if(conflict || !braces.isEmpty()) {
				System.out.println("Missmatch");
			} else {
				System.out.println("No missmatch");
			}	
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
