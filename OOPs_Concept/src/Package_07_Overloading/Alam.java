package Package_07_Overloading;

public class Alam {
	
	
	
	public void load() {
		
		String raj = " Bangladesh";
		
		System.out.println(raj);
	}	
	

	public static  class  alam1 extends Alam{
	public void load() {
		
		String ta = " chittagong";
		
		System.out.println(ta);

	}
		
	

	}
	public static void main(String[] args) {
		
	 Alam obj = new alam1();
	 
	 obj.load();
		


	}
	 
}	 
