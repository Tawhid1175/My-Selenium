package Package_08_Constractor;

public class Overloading_constructor_method {
	
	// number er sonkha porivorton kore overloading korte pari
	
	// ekhne sonkha eki holeo data Type change korar korone erronr show korce na

	
	Overloading_constructor_method(int a){
		
		int x= a;
		System.out.println(x);
	}
	
	
Overloading_constructor_method(double b){
		
		double y= b;
		System.out.println(y);
		
	}

  public static void main( String [] args) {
	  
	  Overloading_constructor_method obj1 = new Overloading_constructor_method(10); 
	 
	  Overloading_constructor_method obj2 = new Overloading_constructor_method(10.29090);
  }
}
