class NailCutter{
	
	String brand;
	Size size;
	boolean isSharp;
	boolean hasFile; 
    String material;
	
	NailCutter(String brand,boolean isSharp,String material){
		this.brand=brand;
		this.isSharp=isSharp;
		this.material=material;
	
	}
	
	void info(){
		
		System.out.println("\nRunning info in NailCuttesr :)");
		System.out.println("Brand:"+this.brand);
		System.out.println("length In Cm:"+this.size);		
		System.out.println("Is harp:"+this.isSharp);
		System.out.println("has File:"+this.hasFile);
		System.out.println("Material:"+this.material);
		
	}
	
	
}