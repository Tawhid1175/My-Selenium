package Package_02_function_parameter;

public class alam1 {
	

  public void al(int a, int b) {
	  int c = a +b;
	  System.out.println(c);
  }



  public void al(int a, int b, int c) {
	  int d = a +b+c;
	  System.out.println(d);
  }

	
	public static void main(String[] args) {
		
	


alam1 obj  =new alam1();
obj.al(100, 100);
 
obj.al(100, 100, 100);

	}

}
