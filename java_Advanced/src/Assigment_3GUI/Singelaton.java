package Assigment_3GUI;

public class Singelaton {
	public static Weight singleFrame = null;
	public static CalculatorFrame calcu = null;
	public App app;
	private Singelaton() {
		
	}
	public static Weight makeFrame() {
			if (singleFrame == null) {
			  singleFrame = new Weight();
			}
			return singleFrame;
			
	}
	public static CalculatorFrame makeFrame1() {
		if (calcu == null) {
		  calcu = new CalculatorFrame();
		}
		return calcu;
		
}
	

}
