package nov;

import java.util.Scanner;

public class zad11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("String 1?");
		String s1 = sc.nextLine();
		System.out.println("String 2?");
		String s2 = sc.nextLine();

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
 		
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[0] && count == 0) {
				count++;
			}
			else if(arr1[i] == arr2[count]) {
				count ++;
			}
			else if(count!=0) {
					count = 0;
					i--;
			}
			
			if(count == arr2.length){
				if(count == arr2.length) {
					System.out.println("Yes\nMatched at index " + (i - count + 1));
				}
				break;
			}
		}
		
		if(count != arr2.length) {
			System.out.println("No");
		}

		
		
	}

}
