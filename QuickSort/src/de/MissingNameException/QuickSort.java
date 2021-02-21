package de.MissingNameException;

import java.util.ArrayList;
/**
 * QuickSort
 * @author MissingNameException
 *
 */
public class QuickSort {
	
	private static int steps = 0;
	
	/**
	 * Takes last element as pivot and corrects its possision
	 * @param list ArrayList
	 * @param low int
	 * @param high int
	 * @return index + 1
	 */
	private static int partition(ArrayList<Integer> list, int low, int high) {
		int pivot = list.get(high);
		int index = (low - 1);
		
		for (int i = low; i < high; i++) {
			if(list.get(i) < pivot) {
				index++;
				
				int temp = list.get(index);
				list.set(index, list.get(i));
				list.set(i, temp);
			}	
		}
		
		int temp = list.get(index + 1);
		
		list.set(index + 1, list.get(high));
		list.set(high, temp);
		
		return index + 1;
	}
	
	/**
	 * Sorts the list recursively
	 * @param list ArrayList
	 * @param low int
	 * @param high int
	 */
	public static void sort(ArrayList<Integer> list, int low, int high) {
		if(low < high) {
			steps++;
			int pi = partition(list, low, high);
			
			sort(list, low, pi-1);
			sort(list, pi+1, high);
		}
	}
	
	/**
	 * The method name already says it!
	 * @return steps
	 */
	public static int getSteps() {return steps;}
}
