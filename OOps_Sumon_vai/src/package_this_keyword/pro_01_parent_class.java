package package_this_keyword;

public class pro_01_parent_class {
	
	// class level er kono variable local level niye jaw
	// se jnno this keyword use korete hobe
	
	int a = 555;
	
	void usethis() {
		
	int a =600;	
	System.out.println(a);	
	System.out.println(this.a);
	}
// ekhn ami  jodi this  keyword  use kori tahole class level variable print korbe
	// r jodi this keyword ure na kori tahole local variable k indicate korbe
	public static void main( String [] args) {
		
		 pro_01_parent_class obj = new  pro_01_parent_class();
		 
		 obj.usethis();
	}
}
