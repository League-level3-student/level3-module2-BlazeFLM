package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	/*
	 * Use the bubble sorting algorithm to sort the array. You can use
	 * display.updateDisplay() to show the current progress on the graph.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean swapped;

		for (int j = 0; j < array.length - 1; j++) {
			swapped = false;
			
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					swapped = true;
					
					display.updateDisplay();
				}
			}
			
			if(!swapped) {
				break;
			}

		}
	}
}
