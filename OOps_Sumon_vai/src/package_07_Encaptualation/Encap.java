package package_07_Encaptualation;

public class Encap {
// amra jodi kono method er age private access modifire di
	// tahole seta onno class ba method e use korte parbo na
	// oi private access modifire k jodi amra onno class e use korte hoy 
	// tahole amder setter abong getter method use korte hobe
	
	// private data gulu je amra onno class e ki vhabe use korbo, ssetten abong getter method diye
	
	// data  setter method diye set korbe
	// data getter method diye get korbe
	
	private String rajibname;
	
	private int rajibsalary;
	
	public static void main(String[] args) {
	
		Encap obj = new Encap();
		obj.setRajibnmane("Rajib chowdhary");
		obj.setRajibsalary(10000);
		
		System.out.println(" rajib get IT job" +obj.getRajibnmane());
		System.out.println(" Rajib will get " + obj.getRajibsalary());

	}
	



	public String getRajibnmane() {
		return rajibname;
	}

	


	
	public void setRajibnmane(String rajibname ) {
	
		this.rajibname= rajibname;
	}
	
	

	public int getRajibsalary() {
		return rajibsalary;
	}

	


	
	public void setRajibsalary(int rajibsalary) {
	
		this.rajibsalary= rajibsalary;
	}
	

	



	


}
