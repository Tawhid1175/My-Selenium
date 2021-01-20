package Package_07_Overloading;

public class alam1 {


	
	public void my ( int a , int b ) {
		


		int c = a +b;
		
		System.out.println(c);
	}
	
public void my ( int a , int b ,int c ) {
		
		int d = a + b -c;
		
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		alam1 al = new alam1();
		
	     al.my(20,30 );
		al.my(300, 200, 50);
		

	}

}
