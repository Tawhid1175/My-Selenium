package Package_15_multitaking_By_interface;

public class Program_05_MainMethod1 {

	

	public static void main(String[] args) {
		
		
		// amra caile sora sori ai main method theke multitasking korte pari
		// sorasori korte pari
		
		Thread x = new Thread(new Runnable() {
			
			public void run() {
				
				
				for ( int i = 0; i < 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
					System.out.println( " Bangladesh");
				}
			}
			
		});
		
	x.start();	

	}

}
