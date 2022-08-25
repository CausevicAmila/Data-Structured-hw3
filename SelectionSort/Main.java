package ibu.edu.homework3.SelectionSort;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[10000];
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		SelectionSort.sort(ipAddress);
		IPaddress.writeToFile("/Users/acaus/Downloads/selectionsort.csv", ipAddress);
	}	
		}





