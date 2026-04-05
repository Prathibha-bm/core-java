class SpecsRunner{
	
	public static void main(String[] args){
		Specs ref1=new Specs();
		Specs ref2=new Specs(1);
		Specs ref3=new Specs(2.0f, "Titan Eye+");
		Specs ref4=new Specs("Computer", true,"Rimless");
		Specs ref5=new Specs("Blue", 50, 3000, false);
		
		
ref1.showMethod();
ref2.showMethod();
ref3.showMethod();
ref4.showMethod();
ref5.showMethod();

	}

}