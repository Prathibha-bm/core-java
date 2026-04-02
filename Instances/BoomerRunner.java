class BoomerRunner{
	
	public static void main(String[] args){
		Boomer ref1=new Boomer(101, "Wood", "V-Shape", "Brown",30.5, 0.5, 12.0, "AeroFly",true, true);
		Boomer ref2=new Boomer(102, "Plastic", "Curved", "Red",25.0, 0.4, 10.5, "SkyWing",true, false);
		Boomer ref3=new Boomer(103, "Carbon Fiber", "Tri-Blade", "Black",40.0, 0.6, 14.0, "ProSpin",false, false);
		
		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();

}

}