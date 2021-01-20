package Package_05_Static_variable;

public class alam1 {
	
	
	public static int a = 100;
	public static int b = 200;
	public static int c = a + b;
	
	public void al() {
		
		System.out.println(" enter the value of c :" + this.c);
	}
	
	
	
	

	public static void main(String[] args) {
		
    alam1 obj = new alam1();
    obj.al();
    
    
	}

}
