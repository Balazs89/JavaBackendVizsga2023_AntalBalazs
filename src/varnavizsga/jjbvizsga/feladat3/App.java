package varnavizsga.jjbvizsga.feladat3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BookManager brObj = new BookManager();

	brObj.CreatingTheList();
	brObj.addBook(2, "dd", "ff", 1300, true);
	brObj.addBook(4, "dd33", "fggf", 1400, false);
   
	
   System.out.println("Könyvek számának meghatározása:");
   System.out.println(brObj.getBookCount());
   
   
   System.out.println("Könyvek árának összegzése:");
   System.out.println(brObj.getTotalPrice());
   
   
   System.out.println("Akciós könyvek száma:");
   System.out.println(brObj.countOnSale());
   

	//brObj.addBook(2, "dd", "ff", 1300, false);
	//brObj.addBook(4, "dd33", "fggf", 1400, false);
	
  //  List<Book> books = new ArrayList<Book>();
     
     
   //books = brObj.CreatingTheBookList();
		
	//books.add(newBook);
		
	
		
		
		
		
		//brObj.getBookCount();

	}

}
