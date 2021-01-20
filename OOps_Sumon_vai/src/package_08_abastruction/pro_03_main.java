package package_08_abastruction;

public class pro_03_main {

	public static void main(String[] args) {
		
		pro_02_abastruction_son_class obj = new pro_02_abastruction_son_class();
        obj.rajib1();
        obj.dada2();
        obj.dada3();
        obj.dada4();
        
        // overring er jnno Top casting method diye korte hobe
        // ekhne amr father class obj crete korte hole 
        // top casting korte hobe
        // ekhne dada4 method ta use korte parbo ,
        // because dada4 seta son class er property 
        // se tar proparty father k dibe na 
        
        pro_01_abastruction_father_class obj1 = new pro_02_abastruction_son_class();
        
        obj1.rajib1();
        obj1.dada2();
        obj1.dada3();
	}

}
