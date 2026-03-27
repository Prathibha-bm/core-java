class FlagRunner{

	public static void main(String[] args){
		Flag var1=new Flag();
		Flag var2=new Flag();
		Flag var3=new Flag();
		Flag var4=new Flag();
		Flag var5=new Flag();
		
		System.out.println("\nDefault Values are:");

		System.out.println("Color: "+var1.color);
		System.out.println("Nation: "+var2.nation);
		System.out.println("Length: "+var3.length);
		System.out.println("Width: "+var4.width);
		System.out.println("Shape: "+var5.shape);
		
		var1.color="Red ";
		var2.nation="America";
		var3.length=6;
		var4.width=5;
		var5.shape="Rectangle";
		
		System.out.println("\n Updated Values are:");

		System.out.println("Color: "+var1.color);
		System.out.println("Nation: "+var2.nation);
		System.out.println("Length: "+var3.length);
		System.out.println("Width: "+var4.width);
		System.out.println("Shape: "+var5.shape);

	
	}
}