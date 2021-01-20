package Package_03_Instance_variable;

public class Alam2 {
	
	public int a = 100;
	
	public int b = 200;
	
	public int c =a + b;
	
	
	
	
	 public void my() {
		 
		 
		 this.c = this.a + this.b;
		 
		 System.out.println(" enter the  valu of a and b :" +this.c);
	 }

	public  static void main(String[] args) {
		 // ekhne age method k call korte hobe 
		
		 Alam2 obj = new Alam2();
		
		 obj.my();
		
		 System.out.println(obj.a);
		 
		 System.out.println(obj.b);
		 System.out.println(obj.c);

	}

}
