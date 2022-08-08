public abstract class CellPhone {
	
	public abstract String getBrand();
	public abstract String getModel();
	public abstract String getCapacity();
	
	@Override
	public String toString(){
		return "Brand = "+this.getBrand()+", Model ="+this.getModel()+", Type ="+this.getCapacity();
	}
}