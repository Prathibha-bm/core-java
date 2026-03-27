class IpadRunner{

	public static void main(String[] args){
		Ipad instance1=new Ipad();
		Ipad instance2=new Ipad();
		Ipad instance3=new Ipad();
		Ipad instance4=new Ipad();
		Ipad instance5=new Ipad();
		
		System.out.println("\nDefault Values are:");
		
		System.out.println("Id:"+instance1.id);
		System.out.println("Model:"+instance2.model);
		System.out.println("Storage:"+instance3.storage);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

		instance1.id=1243;
		instance2.model="Ipad Pro 11";
		instance3.storage=256;
		instance4.color="White";
		instance5.price=400012;
		
		 
		System.out.println("\n Updated Values are:");

		System.out.println("Id:"+instance1.id);
		System.out.println("Model:"+instance2.model);
		System.out.println("Storage:"+instance3.storage);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

	
	}
}