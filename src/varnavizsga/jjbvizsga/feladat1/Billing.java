package varnavizsga.jjbvizsga.feladat1;

public class Billing {
	
	

    public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
        
	    return (vatRate+100)/(100)*(priceWithoutVAT);
    	
        
    }

    public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
        return -1;
    }

    public static String displayBook(String author, String title, int priceWithVAT) {
        return null;
    }
}
