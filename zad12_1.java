package nov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class zad12_1 {

	public static void main(String[] args) {
		
		int[] list = new int[] {-8, 0, 3, 5, 12, 13, 17, 41};
		int sum = 18;
		System.out.println(zad12_1.method1(list, sum));
		System.out.println(zad12_1.method2(list, sum));
		System.out.println(zad12_1.method3(list, sum));
		System.out.println(zad12_1.method4(list, sum));
		
		
	}

	
	public static boolean method1(int[] list, int sum) {
		for(int i = 0; i < list.length; i++) {
			for(int j = i+1; j<list.length; j++) {
				if(list[i] + list[j] == sum) {
					return true;
					
				}
				
			}
			
		}
		return false;
	}
	
	
	public static boolean method2(int[] list, int sum) {
		for(int i = 0; i < list.length; i++) {
			if(BinarySearch.binarySearch(list, sum - list[i]) > 0) {
					return true;
					
				}
		}
		return false;
	}
	
	public static boolean method3(int[] list, int sum) {
		
		int last = list.length -1;
		int first = 0;
		
		while(first< last) {
			if((list[first] + list[last]) > sum) {
				last --;
			}
			else if((list[first] + list[last]) < sum) {
				first ++;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	
	
	public static boolean method4(int[] list, int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < list.length; i++) {
			if(set.contains(list[i])) {
				return true;
			}
			set.add(sum - list[i]);
		}
		return false;
		
	}
	
	
}
