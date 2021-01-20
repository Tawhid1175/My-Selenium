package Package_03_Instance_variable;

public class alam3 {
	
	
	
	public int a = 100;
	
	public int b = 200;
	
	public int c;
	
	public void alam() {
		
	 this.c= this.a+this.b;
	 
	 System.out.println(this.c);
	 
	}
	

	public static void main(String[] args) {
		
		alam3 obj = new alam3();
		obj.alam();
		
	

	}

}
