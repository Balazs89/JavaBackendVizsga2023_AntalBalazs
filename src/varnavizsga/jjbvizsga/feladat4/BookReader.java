package varnavizsga.jjbvizsga.feladat4;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class BookReader {
	

	
	

    public void readBooksFromFile(String fileName) {
    	
    	FileHandler fObj = new FileHandler();
    	try {
			fObj.Listuploading();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    public int countOnSale() {
        throw new UnsupportedOperationException();
    }

    public String getCheapest() {
        throw new UnsupportedOperationException();
    }
}
