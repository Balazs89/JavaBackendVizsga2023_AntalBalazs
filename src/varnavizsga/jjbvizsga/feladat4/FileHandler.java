package varnavizsga.jjbvizsga.feladat4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

	
	List<Book> books = new ArrayList<Book>();
	
	
	public List<Book> Listuploading() throws UnsupportedEncodingException, FileNotFoundException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("books.csv"),"UTF-8;"));
		
		try {
			String fejlec= br.readLine();
			
			while (br.ready()) {
				
				String row = br.readLine();
				String[] rowData = row.split(";");
				
					Book bookObj = new Book(
							Integer.parseInt(rowData[0]),
							rowData[1],
							rowData[2],
							Integer.parseInt(rowData[3]),
							Boolean.parseBoolean(rowData[4])
							);	
				
				
					books.add(bookObj);
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
		
		
		
	}
	
	
	
	
}
