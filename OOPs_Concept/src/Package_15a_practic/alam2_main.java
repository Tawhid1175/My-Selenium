package Package_15a_practic;

public class alam2_main {

	public static void main(String[] args) {
		
		  alam obj = new alam();
         alam1 obj1 = new alam1();
         
         Thread x = new Thread(obj);
          x.start();
          
          
          Thread y = new Thread(obj1);
          y.start();
          
	}

}
