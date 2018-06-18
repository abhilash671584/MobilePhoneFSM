package abp;

public class Tester {

	public static void main(String a[]) {
		try {
			MobilePhone engine = new MobilePhone();
			engine.fireEvent("callReceived");
			engine.fireEvent("red");
			engine.fireEvent("red");
			System.out.println("Current State is :" + engine.getCurrentState().getId());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
