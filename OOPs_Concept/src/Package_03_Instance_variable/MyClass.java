package Package_03_Instance_variable;

public class MyClass {
	
	
	public int a = 10;
	
	public int b = 20;
	
	public int c;
	
	// Reference Variable//instance variable
	
    // instance varialbe gule ke declared kora hoy ekata class er vitore 
	
    // but class er vitore sei sob  method ba function thake  sei gulur bahire 
		
    // oi class er vitore jotho gulu function ba method ace amra sob khane oi instance variable diye use korte hole 
	
	// amder this keyword use korte hoy
      
	// from Sumon vai
	
	// as a user ami ja ja korci se ghuli call kora

		// Reference ta lage non static method e
	

	//Reference ta lage non static method e//
		
	public void add() {
		
		
	//ia ta holo function ba method
	// jodi amra kon instance variable k method ba function er bahir theke vitore niye ase 	access korte hoy se ketre thtis key word use korte 
	// instaance variable k method er vitor  bebohar korte hole this keyword use korte hobe
		
	 this.c = this.a +this.b;	
	
	 System.out.println(this.c);
	 
	}
	
	
	
	

}
