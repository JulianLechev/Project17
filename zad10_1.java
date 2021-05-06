package nov;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad10_1 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		int points = 0; int correctAns = 0; int wrongAns = 0;
		Map<String, String> CapCoun = new HashMap<String, String>();
		
		CapCoun.put("Washington", "USA");
		CapCoun.put("Moscow", "Russia");
		CapCoun.put("Berlin", "Germany");
		CapCoun.put("London", "UK");

		CapCoun.put("Lisbon", "Portugal");
		CapCoun.put("Brazil", "Brazil");
		CapCoun.put("Delhi", "India");
		CapCoun.put("Cairo", "Egypt");
		CapCoun.put("Stockholm", "Sweden");

		CapCoun.put("Tehran", "Iran");
		CapCoun.put("Jakarta", "Indonesia");
		CapCoun.put("Bangkok", "Thailand");
		CapCoun.put("Bogota", "Colombia");
		CapCoun.put("Wellington", "New Zealand");
		
		zad10_1.easy(CapCoun);

		
	}
	
	public static void easy(Map<String,String> map) {
		int points = 0; int correctAns = 0; int wrongAns = 0;
		System.out.println("Round 1: Each correct answer brings 1 point");
		List<String> capitals = new ArrayList(map.keySet());
		Collections.shuffle(capitals);
		Scanner sc = new Scanner(System.in);
		
		for(String capital: capitals) {
			System.out.println("The capital of " + map.get(capital) + "?\n");
			
			
			if(sc.next().equals(capital)) {
				points++;
				correctAns++;
				System.out.println(points);
			}
			
			else {
				wrongAns++;
				System.out.println(capital + " - " + map.get(capital));
				System.out.println("Points: " + points);
			}
		}
		
	}
	
	
	
	
	
	

}
