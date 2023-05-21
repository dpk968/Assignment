package assignment;

public class NonVeg extends Pizza{

	private String nonVegToppings;
	private static int counter = 1743;
	
	
	public NonVeg() {
		super();
		counter++;
	}

	public NonVeg(int itemId, String category, String type, String size,String nonVegToppings) {
		super(itemId, category, type, size);
		counter++;
		billId = itemId+(int) Math.pow(10,(itemId+"").length())+counter;
		this.nonVegToppings = nonVegToppings;
		
	}

	public String getNonVegToppings() {
		return nonVegToppings;
	}

	public static int getCounter() {
		return counter;
	}

	public NonVeg(String nonVegToppings) {
		super();
		this.nonVegToppings = nonVegToppings;
	}
	
	@Override
	public boolean validateType() {
		if(type.equalsIgnoreCase("NonVegStuffed") || 
				type.equalsIgnoreCase("NonVegNotStuffed"))
			return true;
		return false;
	}

	@Override
	public float identifyCost() throws CustomException {
		
		if(!validateType()) throw new CustomException("Invalid Type");
		
		if(getType().equalsIgnoreCase("NonVegStuffed")) {
			
			if(!validateSize()) throw new CustomException("Invalid Size");
			
			if(getSize().equalsIgnoreCase("small"))
				return 50;
			else if(getSize().equalsIgnoreCase("Medium"))
				return 100;
			else
				return 150;
		}else{
			
			if(!validateSize()) throw new CustomException("Invalid Size");
			
			if(getSize().equalsIgnoreCase("small"))
				return 40;
			else if(getSize().equalsIgnoreCase("Medium"))
				return 80;
			else
				return 1200;
		}
	
	}

	@Override
	public float calculateBillAmount() throws CustomException {
		if(validateCategory())
			return (float) (identifyCost() + identifyCost()*0.1);
		throw new CustomException("Invalid Category");
	}
	
	

	
	

}
