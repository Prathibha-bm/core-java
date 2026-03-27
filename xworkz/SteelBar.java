class SteelBar{

	public static void main(String[] args){
		Steel instance1=new Steel();
		Steel instance2=new Steel();
		Steel instance3=new Steel();
		Steel instance4=new Steel();
		Steel instance5=new Steel();
		
		System.out.println("\nDefault Values are:");
		System.out.println("id:"+instance1.id);
		System.out.println("Type:"+instance2.type);
		System.out.println("Weight:"+instance3.weight);
		System.out.println("isOriginal:"+instance4.isOriginal);
		System.out.println("Density:"+instance5.density);

		instance1.id=101;
		instance2.type="Tap";
		instance3.weight=6;
		instance4.isOriginal=true;
		instance5.density=4.8;
		
		System.out.println("\n Updated Values are:");

		System.out.println("id:"+instance1.id);
		System.out.println("Type:"+instance2.type);
		System.out.println("Weight:"+instance3.weight);
		System.out.println("isOriginal:"+instance4.isOriginal);
		System.out.println("Density:"+instance5.density);

	
	}
}