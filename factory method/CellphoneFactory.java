public class CellphoneFactory {

	public static CellPhone getCellphone(String type, String brand, String model, String capacity){
		if("ios".equalsIgnoreCase(type)) 
            return new ios(brand, model, capacity);
		else if("android".equalsIgnoreCase(type))
            return new android(brand, model, capacity);
		return null;
	}
}