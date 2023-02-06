package varnavizsga.jjbvizsga.feladat1;

public class Billing {
	
	

    public static Double priceWithVAT(double vatRate, int priceWithoutVAT) {
        
    	Double vatAmount = vatRate/100*priceWithoutVAT;
	    return Math.round(priceWithoutVAT)+vatAmount;
    	
        
    }

    public static Double priceWithoutVAT(double vatRate, int priceWithVAT) {
    	
    	Double vatAmount = vatRate/100*priceWithVAT;
	    return Math.round(priceWithVAT)-vatAmount;
        
        
        
    }

    public static String displayBook(String author, String title, int priceWithVAT) {
        return null;
    }
}
