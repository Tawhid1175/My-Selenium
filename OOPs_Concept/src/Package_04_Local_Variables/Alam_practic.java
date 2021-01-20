package Package_04_Local_Variables;

public class Alam_practic {
	
 public  int ins;
    public void al() {
    	
     int a = 100;
     this.ins = a;
     int b = 200;
     this.ins =b;
     int c = a + b;
     this.ins =c;
    	
    }
	

	public static void main(String[] args) {
		
		Alam_practic  obj = new  Alam_practic();
		
		obj.al();
		System.out.println(obj.ins);
		
		//System.out.println(obj.ins);

	}

}
