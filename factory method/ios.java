public class ios extends CellPhone {

	private String brand;
	private String model;
	private String capacity;
	
	public ios(String brand, String model, String capacity){
		this.brand=brand;
		this.model=model;
		this.capacity=capacity;
	}
	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public String getModel() {
		return this.model;
	}

	@Override
	public String getCapacity() {
		return this.capacity;
	}
}