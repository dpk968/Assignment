package assignment;

public class Veg extends Pizza{

	
	private String vegToppings;
	private static int counter=1;
	
	public Veg() {
		
	}
	
	
	
	public Veg(int itemId, String category, String type, String size, String vegToppings) {
		super(itemId, category, type, size);
		counter++;
		billId = itemId+(int) Math.pow(10,(itemId+"").length())+counter;
		this.vegToppings = vegToppings;
	}



	public String getVegToppings() {
		return vegToppings;
	}



	@Override
	public boolean validateType() {
		if(type.equalsIgnoreCase("VegStuffed") || 
				type.equalsIgnoreCase("VegNotStuffed"))
			return true;
		return false;
	}

	@Override
	public float identifyCost() throws CustomException {
		
		if(!validateType()) throw new CustomException("Invalid Type");
		
		if(getType().equalsIgnoreCase("VegStuffed")) {
			
			if(!validateSize()) throw new CustomException("Invalid Size");
			
			if(getSize().equalsIgnoreCase("small"))
				return 30;
			else if(getSize().equalsIgnoreCase("Medium"))
				return 60;
			else
				return 90;
		}else{
			
			if(!validateSize()) throw new CustomException("Invalid Size");
			
			if(getSize().equalsIgnoreCase("small"))
				return 20;
			else if(getSize().equalsIgnoreCase("Medium"))
				return 40;
			else
				return 80;
		}
	
	}

	@Override
	public float calculateBillAmount() throws CustomException{
		// TODO Auto-generated method stub
		if(validateCategory())
			return (float) (identifyCost() + identifyCost()*0.05);
		
		throw new CustomException("Invalid Category");
			
		
		
	}

}
