package nov;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class zad11_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String?");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
		LinkedList<Character> longest = new LinkedList<>();
		
		for(int i = 0; i < arr.length; i++) {
			LinkedList<Character> contender = new LinkedList<>();
			contender.add(arr[i]);
			for(int j = i+1; j<arr.length; j++) {
				if(arr[j] > contender.getLast()) {
					contender.add(arr[j]);
				}
			}
			
			if(contender.size() > longest.size()) {
				longest.clear();
				longest.addAll(contender);
			}
			
			contender.clear();
		}
		
		System.out.println(longest);
		
	}

}
