package assignment;

public abstract class Pizza {

	protected int itemId;
	protected int billId; 
	protected String category;
	protected String type;
	protected String size;
	
	
	
	public Pizza() {
		super();
	}



	public Pizza(int itemId, String category, String type, String size) {
		super();
		this.itemId = itemId;
		this.category = category;
		this.type = type;
		this.size = size;
	}



	public int getItemId() {
		return itemId;
	}



	public int getBillId() {
		return billId;
	}



	public String getCategory() {
		return category;
	}



	public String getType() {
		return type;
	}



	public String getSize() {
		return size;
	}
	
	public boolean validateCategory(){
		if(category.equalsIgnoreCase("veg") || 
				category.equalsIgnoreCase("nonveg")) {
			return true;
			
		}
		return false;
	}
	public boolean validateSize() {
		if(size.equalsIgnoreCase("small") ||
				size.equalsIgnoreCase("medium") ||
				size.equalsIgnoreCase("large")) {
			return true;
		}
		return false;
	}
	public abstract boolean validateType() throws CustomException;
	public abstract float identifyCost() throws CustomException;
	public abstract float calculateBillAmount() throws CustomException;
	
	
	
}
