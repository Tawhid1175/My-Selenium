package Package_07_Overloading;

public class Overriding {
	
	   public void Method_Over() {
		   
		   String sr = " alam";
		   
		   System.out.println(sr);
	   }

	   public static class Overriding_son extends Overriding{
			
		   public void Method_Over() {
			   
			   String ta = " rajib";
			   
			   System.out.println(ta);
		   }
   
	       
	   
	public static void main(String[] args) {
		
		// top casting diye korte hobe
		
		// top casting er constructor create korte hoy both class er namdiye
		// mane parent abong child class man diye constructor crate korte pari
		
		Overriding obj = new Overriding_son(); 
		obj.Method_Over();

	}
		
	}

}
