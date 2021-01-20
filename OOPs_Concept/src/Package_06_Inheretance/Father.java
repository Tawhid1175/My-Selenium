package Package_06_Inheretance;

public class Father {
	
	// baba thake age , r sontan thakte pore, badar boysisto gulu kinto sontan pai, sontan jokh  uttorodikar hoye jai
	// tokhn kintu babak sontaner kotha sunte hoy  aita k inheritance bole
	
	// programminger  basai 
	//  programiner vitore jokhn amra ekta  super class er under ekta  sub class ready korbo 
	// tokhn amra oi subclass take superClass inherit korbo tokhn amder extends keyword use korbo
	// ekta class er sate onno class inherit korbo  tokhn subclass superclass er sob method access korte parbe
	
	// superClass jei method ta ace, seta  jodi subClass ace overriding korar tahole ekhn SubClass er kotha sunbe
	// tokhn r super class er kotha sunbe na ;
	
	public int a = 100;
	public int b = 20;
	
	public int c;
	
	public void add() {
		
		// aita holo ekta method 
		
		this.c=this.a+this.b;
		
		
		System.out.println(this.c);
	}
	
	

}
