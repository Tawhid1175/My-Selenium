package Package_15a_practic;

public class alam implements Runnable{
	
	public void run() {
		
		for ( int a = 0; a<10; a++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			System.out.println(" rajib is good boy");
		}
	}

}
