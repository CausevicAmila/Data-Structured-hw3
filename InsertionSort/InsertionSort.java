package ibu.edu.homework3.InsertionSort;

public class InsertionSort{
	public static void sort(Comparable[] elements) {
	    for (int i = 0; i < elements.length; i++) {
	        for (int j = i; j > 0; j--) {
	            if (elements[j].compareTo(elements[j - 1])== -1) {
	                IPaddress.swap(elements, j, j - 1);
	            } else {
	                break;
	            }
	        }
	    }
	}
	
}

