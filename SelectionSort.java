package nov;
public class SelectionSort {
	/** The method for sorting the numbers */
	public static void selectionSort(int[] arrS) {
		for (int i = 0; i < arrS.length - 1; i++) {
// Find the minimum in the list[i..list.length-1]
			double currentMin = arrS[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < arrS.length; j++) {
				if (currentMin > arrS[j]) {
					currentMin = arrS[j];
					currentMinIndex = j;
				}
			}
// Swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				arrS[currentMinIndex] = arrS[i];
				arrS[i] = (int) currentMin;
			}
		}
	}
}