package Package_04_Local_Variables;

public class alam1{
	
	public int ins;
	
	public void sum() {

     int a = 10;
     this.ins =a;
     
     int b = 20;
     this.ins =b;  
     int c = a + b;
		this.ins =c; 
	}

	public static void main(String[] args) {
		

		alam1 al = new alam1();
		al.sum();
		
	}

}
