package week1.day1;

public class Mobile {
	public void sendsms() {
		String mobilemodel ="redmi";
		float mobileweight =9.11f;
	
	}
	public void makecall() {
		boolean fullcharged=true;
		int mobilecost=15000;
	}
	
	public static void main(String[]args) {
		Mobile action=new Mobile();
		action.sendsms();
		action.makecall();
		System.out.println("action.mobilemodel");
		System.out.println("action.mobileweight");
		System.out.println("action.fullcharged");
		System.out.println("action.mobilecost");
		System.out.println("This is My Mobile");
		
		
	}
}
