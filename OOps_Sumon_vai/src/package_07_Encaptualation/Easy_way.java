package package_07_Encaptualation;

public class Easy_way {
	// source e giye Generate setters and getters
	
	//ekta private access modifier k 
	private String alam;
	private int alamsalary;
	
	public String getAlam() {
		return alam;
	}

	public void setAlam(String alam) {
		this.alam = alam;
	}

	public int getAlamsalary() {
		return alamsalary;
	}

	public void setAlamsalary(int alamsalary) {
		this.alamsalary = alamsalary;
	}

	

	public static void main(String[] args) {
		
		Easy_way obj = new Easy_way();
		obj.setAlam("MD Tawhidul alam");
		obj.setAlamsalary(3200);
		
		
		System.out.println(obj.getAlam());
		System.out.println(obj.getAlamsalary());
		

	}

}
