package Package_08_Constractor;

public class Alam {
	
	
  Alam(){
	  
	  System.out.println(" this is come from constructor");
  }
  

Alam(int a , int b){
	int c = a+b;
	  
	  System.out.println(c);
  }


	public static void main(String[] args) {
	
    Alam obj = new Alam();
    Alam obj1 = new Alam(20,30);
    



		

	}

}
