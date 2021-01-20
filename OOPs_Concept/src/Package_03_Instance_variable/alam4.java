package Package_03_Instance_variable;

public class alam4 {
	
	 public static int a = 100;
	 
	 public static int b = 200;
	 
	 int c ;
	 
	  public void add() {
		  
		  this.c =this.a + this.b;
		  
		  System.out.println(this.c);
	  }

	public static void main(String[] args) {
		
		alam4 obj = new alam4();
		obj.add();
	}

}
