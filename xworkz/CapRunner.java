class CapRunner{

	public static void main(String[] args){
		Cap instance1=new Cap();
		Cap instance2=new Cap();
		Cap instance3=new Cap();
		Cap instance4=new Cap();
		Cap instance5=new Cap();
		
		System.out.println("\nDefault Values are:");
		
		System.out.println("Number:"+instance1.number);
		System.out.println("Type:"+instance2.type);
		System.out.println("Size:"+instance3.size);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

		instance1.number=1000;
		instance2.type="Bottol Cap";
		instance3.size="XL";
		instance4.color="Black";
		instance5.price=4.8;
		
		 
		System.out.println("\n Updated Values are:");

		System.out.println("Number:"+instance1.number);
		System.out.println("Type:"+instance2.type);
		System.out.println("Size:"+instance3.size);
		System.out.println("Color:"+instance4.color);
		System.out.println("Price:"+instance5.price);

	
	}
}