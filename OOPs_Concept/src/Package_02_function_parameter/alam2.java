package Package_02_function_parameter;

public class alam2 {
	


	
 public void dada( int a, int b) {
	
	
	int c = a +b;
	System.out.println(c);
	
		
	}

 public void dada( int x , int y, int z) {
	
	int v = x + y + z;
	
	System.out.println(v);
	
	
}

	public static void main(String[] args) {
		
		alam2 obj = new alam2();
		obj.dada(100, 100);
		obj.dada(200, 200, 200);
		

	}

}
