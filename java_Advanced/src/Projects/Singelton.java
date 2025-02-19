package Projects;

public class Singelton {
	public static Singelton Stack = null;
	public static Singelton reCall = null;
	public static Singelton reStore = null;
	
	private Singelton() {
		
	}
	public static void stack() {
		if(Stack == null) {
			RPNForm.stack.setVisible(true);	
			Stack = new Singelton();
	}
		
	}
	public static void reCall() {
		if(reCall == null) {
			RPNForm.rpnRecall.setVisible(true);
			reCall = new Singelton();
		}
	}
	public static void reStore() {
		RPNForm.rpnStore.setVisible(true);
		reStore = new Singelton();
	}
}
