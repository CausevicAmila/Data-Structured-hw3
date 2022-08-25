package ibu.edu.homework3.ShellSort;
import java.io.IOException;
public class Main{
	public static void main(String[] args) throws IOException {
		IPaddress[] ipAddress = new IPaddress[4637052];
		ipAddress = IPaddress.readNumbers("/Users/acaus/Downloads/IP-COUNTRY-REGION-CITY-SHUFFLED/IP-COUNTRY-REGION-CITY-SHUFFLED.csv");
		ShellSort.sort(ipAddress);
		IPaddress.writeToFile("/Users/acaus/Downloads/shellsort.csv", ipAddress);
		}
	}





