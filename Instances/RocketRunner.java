class RocketRunner{
	
	public static void main(String[] args){
		Rocket ref1=new Rocket("Falcon 9", "SpaceX", 70.0, 549000, 500000,2, 22800, true, "RP-1 / LOX", 7600);
		Rocket ref2=new Rocket("Saturn V", "NASA", 110.6, 2970000, 2030000,3, 140000, false, "Liquid Hydrogen / LOX", 11000);
		Rocket ref3=new Rocket("GSLV Mk III", "ISRO", 43.43, 640000, 400000,3, 10000, false, "Cryogenic + Solid Fuel", 8200);
		
		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();

}

}