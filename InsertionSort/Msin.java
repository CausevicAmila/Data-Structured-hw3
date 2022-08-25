package ibu.edu.homework3.InsertionSort;
import java.io.IOException;

public class Msin{
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[50000];
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		InsertionSort.sort(ipAddress);
		IPaddress.writeToFile("/Users/acaus/Downloads/insertionsort.csv", ipAddress);
	}	
		}



