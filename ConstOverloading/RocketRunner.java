class RocketRunner{
	
	public static void main(String[] args){
		Rocket ref1=new Rocket();
		Rocket ref2=new Rocket("Saturn V");
		Rocket ref3=new Rocket("ISRO", 43.43);
		Rocket ref4=new Rocket(43.43, 640000, 400000);
		Rocket ref5=new Rocket( 10000, false, "Cryogenic + Solid Fuel", 8200);

		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();
ref4.showMethod();
ref5.showMethod();

}

}