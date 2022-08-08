public class Main {
	public static void main(String[] args) {
		CellPhone ios = CellphoneFactory.getCellphone("Ios","Iphone ","13 pro max ","256GB");
		CellPhone android = CellphoneFactory.getCellphone("Android","Samsung","Galaxy S22","1To");
		System.out.println("Cellphone Ios: " + ios);
		System.out.println("Cellphone Android : " + android);
	}
}