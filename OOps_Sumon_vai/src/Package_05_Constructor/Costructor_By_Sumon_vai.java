package Package_05_Constructor;



public class Costructor_By_Sumon_vai {
	
	

	// constructor initialized the class object
	// Constructor create kore class name abong public keyword diye
	// without constr our class does not work
	
	// constructor two types
	 // a: Default const .. setate parameter thake na
	 // b: parameter constructor .... parameter thakebe
	//  c : hidden constructor ... hidden k call na korleo se kaj korbe
	
	 public Costructor_By_Sumon_vai() {
		 System.out.println(" This is default constructor");
		 
	 }
	 
	 public Costructor_By_Sumon_vai(int x, int y) {
		  int c = x+y;
		  System.out.println("addition x and y " + c);
		  
		 System.out.println(" This is parameter costructor");
	
	 }
	 
	 public Costructor_By_Sumon_vai(int x, int y,int v) {
		 
		 int z= x + y-v;
		 
		 System.out.println("additions x and y_-v" +z);
		 
		 System.out.println(" This is parameter_2 costructor");
	
	 }
	
	

	public static void main(String[] args) {
		
		 Costructor_By_Sumon_vai obj = new  Costructor_By_Sumon_vai();
	
		 Costructor_By_Sumon_vai obj1 = new  Costructor_By_Sumon_vai(50,50) ;
		
		 Costructor_By_Sumon_vai obj2 = new Costructor_By_Sumon_vai( 100,100,50);


	}


}
