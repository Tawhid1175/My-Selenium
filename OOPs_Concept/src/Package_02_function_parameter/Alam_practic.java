package Package_02_function_parameter;

public class Alam_practic {
	
	public void alam(int a, int b) {
		
		 int c = a + b;
		 
		 System.out.println(c);
		
	}
	
	public void alam(int a, int b, int c) {
		
		 int d = a + b +c;
		 
		 System.out.println(d);
		
	}

	    public static void main( String [] args) {
	    	

	    	Alam_practic obj = new Alam_practic();
	    	
           obj.alam(20, 30);
           obj.alam(30, 40, 50);

	    }
}
