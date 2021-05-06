package nov;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class zad8_4 {


	public static void main(String[] args) {
	
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("Rome", "Athens" , "Budapest", "Sofia", "NYC"));
		
		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList("PLovdiv", "Prague" , "Berlin", "Sofia", "NYC"));
		
		System.out.println("Set1 " + queue1);
		System.out.println("Set1 " + queue2);
		
		PriorityQueue<String> union = new PriorityQueue<>(queue1);
		union.addAll(queue2);
		
		PriorityQueue<String> intersection = new PriorityQueue<>(queue1);
		intersection.retainAll(queue2);
		
		PriorityQueue<String> difference = new PriorityQueue<>(union);
		difference.removeAll(intersection);
		
		System.out.println("Union: " + union);
		System.out.println("Intersection: " + intersection);
		System.out.println("Difference: " + difference);
	}

}
