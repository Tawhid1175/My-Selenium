package Package_12_Access_modifiers;

public class sumon_vai_1 {
	
	
	public static int a = 10;
	
	public static int b = 50;
	
	public static int c = 100;
	
	       static int d = 200;
	       
	       
	       public void alam() {
	    	   
	    	   int x = c + d;
	    	   
	    	   System.out.println(" additions of a and b :" + x);
	       }

	public static void main(String[] args) {
		
		sumon_vai_1 obj = new sumon_vai_1();
		obj.alam();
	}

}
