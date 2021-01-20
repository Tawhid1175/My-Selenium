package Package_14a_practic;

public class alam  implements Runnable{
	
	// multitasking by inheritance 
	
	// Multitasking method name sob somoy run hote hobe , onno nam dile execute hobe na
	
	// abond class name er por extends Thread likte hobe 
	
	


   public void run() {
	   
	   for ( int a =0; a <10; a++) {
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		   
		   System.out.println(" rajib is good boy");
	   }
   }
	 

}
