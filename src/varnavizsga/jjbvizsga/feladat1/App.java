package varnavizsga.jjbvizsga.feladat1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double eredmeny =Billing.priceWithVAT(27, 10000);
		System.out.println(eredmeny);
		
		
		
		double eredmeny2 = Billing.priceWithoutVAT(27, 10000);
		
		System.out.println(eredmeny2);
		//System.out.println(Billing.priceWithVAT(27, 100000));

	}

}
