class CupInfo{
	
	public static void main(String[] args){
		Cup instance1=new Cup();
		Cup instance2=new Cup();
		Cup instance3=new Cup();
		Cup instance4=new Cup();
		Cup instance5=new Cup();

		System.out.println("\nDeafult value\n Color: "+ instance1.color);
		System.out.println("Hight: "+instance2.hight);
		System.out.println("diameter: "+instance3.diameter);
		System.out.println("Price: "+instance4.diameter);
		System.out.println("glass: "+instance5.glass);
		
		instance1.color="Blue";
		instance2.hight=10.4;
		instance3.diameter=5.6;
		instance4.price=500;
		instance5.glass=true;
		
		
		System.out.println("\nDeafult value\n Color: "+ instance1.color);
		System.out.println("Hight: "+instance2.hight);
		System.out.println("diameter: "+instance3.diameter);
		System.out.println("Price: "+instance4.diameter);
		System.out.println("glass: "+instance5.glass);
		
		
	}
}