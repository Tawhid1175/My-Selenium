package Package_13_Setter_Getter;

public class Setter_method {
	
	 
	// setter Method variable public thakle amra kub hosoje dhorte pari
	// but private hole seta para jai na , tokhn setter method use korte hobe
	
	private String name;
	
	public void B ( String set ) {
		
		this.name=set;
		
		System.out.println(this.name);
	}

	public static void main(String[] args) {
	
		Setter_method obj = new Setter_method();
		obj.B("tahw");

	}

}
