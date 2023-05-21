package assignment;

public class MainClass {

	public static void main(String[] args) {
		

		System.out.println("hello ji");	
		
		Veg vegPizza = new Veg(456789,"veg","VegStuffed","medIum","Extra chilly");
		
		try {
			System.out.println(vegPizza.calculateBillAmount());
			System.out.println("Bill Id->"+vegPizza.getBillId());
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
