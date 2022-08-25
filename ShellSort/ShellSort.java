package ibu.edu.homework3.ShellSort;
public class ShellSort {
	public static void sort(Comparable[] elements) {
	    int h = 1;                                                      
	    while (h < elements.length / 3) {                               
	        h = 3 * h + 1;                                              
	    }
	    while (h > 0 ) { 
	        for (int i = h; i < elements.length; i++) {                
	            for (int j = i; j >= h; j = j - h) {                       
	                if (elements[j].compareTo(elements[j - h])==1) {           
	                    break;                       
	                } else {
	                	IPaddress.swap(elements, j, j - h);                                      
	                }
	            }
	        }
	        h = h / 3;                                                  
	    }
	}
}

