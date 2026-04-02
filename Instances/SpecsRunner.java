class SpecsRunner{
	
	public static void main(String[] args){
		Specs ref1=new Specs(201, 1.5f, "RayBan", "Reading",true, "Full Rim", "Black", 52, 5000, false);
		Specs ref2=new Specs(202, 0.0f, "Oakley", "Sun",true, "Half Rim", "Brown", 55, 7000, true);
		Specs ref3=new Specs(203, 2.0f, "Titan Eye+", "Computer", true,"Rimless", "Blue", 50, 3000, false);
		
		
ref1.showMethod();
ref2.showMethod();
ref3.showMethod();

	}

}