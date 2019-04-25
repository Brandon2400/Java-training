package DataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\brand\\Documents\\Java course\\Files\\Accounts.csv";
		String dataRow;
		
		try {
			// open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Read the data as long as it is not empty
			while ((dataRow = br.readLine()) != null) {
				// Parse the data by commas
				String[] line = dataRow.split(",");
				// Add the data to the collection
				data.add(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (String[] accounts : data) {
			System.out.print("[");
			for (String field : accounts) {
				System.out.print(field + " ");
			}
			System.out.println("]");
		}
	}

}
