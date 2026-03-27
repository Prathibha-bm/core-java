class JoysticRunner{

	public static void main(String[] args){
		Joystic instance1=new Joystic();
		Joystic instance2=new Joystic();
		Joystic instance3=new Joystic();
		Joystic instance4=new Joystic();
		Joystic instance5=new Joystic();
		
		System.out.println("\nDefault Values are:");
		
		System.out.println("xAxis:"+instance1.xAxis);
		System.out.println("yAxis:"+instance2.yAxis);
		System.out.println("ButtonPressed:"+instance3.buttonPressed);
		System.out.println("isConnected:"+instance4.isConnected);
		System.out.println("Sensitivity:"+instance5.sensitivity);

		instance1.xAxis=120;
		instance2.yAxis=75;
		instance3.buttonPressed=true;
		instance4.isConnected=true;
		instance5.sensitivity=1.5;
		
		 
		System.out.println("\n Updated Values are:");

		System.out.println("xAxis:"+instance1.xAxis);
		System.out.println("yAxis:"+instance2.yAxis);
		System.out.println("ButtonPressed:"+instance3.buttonPressed);
		System.out.println("isConnected:"+instance4.isConnected);
		System.out.println("Sensitivity:"+instance5.sensitivity);

	
	}
}