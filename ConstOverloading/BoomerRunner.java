class BoomerRunner{
	
	public static void main(String[] args){
		Boomer ref1=new Boomer();
		Boomer ref2=new Boomer(102);
		Boomer ref3=new Boomer("Carbon Fiber", "Tri-Blade");
		Boomer ref4=new Boomer("Black",40.0, 0.6);
		Boomer ref5=new Boomer( 14.0, "ProSpin",false, false);
		
		
ref1.showMethod(); //non static method called  by reference
ref2.showMethod();
ref3.showMethod();
ref4.showMethod();
ref5.showMethod();

}

}