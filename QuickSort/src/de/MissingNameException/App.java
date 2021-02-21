package de.MissingNameException;

import java.util.ArrayList;

/**
 * just a Test class
 * @author MissingNameException
 *
 */
public class App {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(53);
		list.add(152);
		list.add(2);
		list.add(55);
		list.add(1);
		list.add(231);
		list.add(6);
		list.add(45);
		list.add(2);
		printList(list);
		QuickSort.sort(list, 0, list.size() - 1);
		System.out.println("\n Sorted! in (" + QuickSort.getSteps() + ")");
		printList(list);
	}
	
	private static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print("[ " + list.get(i) + " ]  ");
		}
	}
}
