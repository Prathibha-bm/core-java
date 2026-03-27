class PowerBankRunner{

	public static void main(String[] args){
		PowerBank instance1=new PowerBank();
		PowerBank instance2=new PowerBank();
		PowerBank instance3=new PowerBank();
		PowerBank instance4=new PowerBank();
		PowerBank instance5=new PowerBank();
		
		System.out.println("\nDefault Values are:");
		
		System.out.println("Capacity:"+instance1.capacity);
		System.out.println("Model:"+instance2.name);
		System.out.println("ChargingPoints:"+instance3.chargingPoints);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

		instance1.capacity=10000;
		instance2.name="Zebronics";
		instance3.chargingPoints=8;
		instance4.color="Perple";
		instance5.price=4000;
		
		 
		System.out.println("\n Updated Values are:");

		System.out.println("Id:"+instance1.capacity);
		System.out.println("Name:"+instance2.name);
		System.out.println("ChargingPoints:"+instance3.chargingPoints);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

	
	}
}