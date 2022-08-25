package ibu.edu.homework3.SelectionSort;

public class SelectionSort {
	
	public static void sort(Comparable[] elements) {
		for (int i = 0; i<elements.length; i++) {
			int min = i;
			for (int j =i+1; j< elements.length; j++) {
				if (elements[j].compareTo(elements[min])== -1) {
					min = j; 
				}
			}
			IPaddress.swap(elements,i,min);
		}
	}
}

