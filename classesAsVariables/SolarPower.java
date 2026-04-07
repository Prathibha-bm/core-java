class SolarPower{
	
	String brand;
	int durabality;
	String type;
	Solar solar;
	
	public SolarPower(String brand,int durabality)
	{
		this.brand=brand;
		this.durabality=durabality;
		
		System.out.println("Brand: " + this.brand);
        System.out.println("Durabality: " + this.durabality);
        System.out.println("type: " + this.type);
		
	}
	
	void info(){
		System.out.println("Running info in SolarPower");
		if(this.solar!=null){
			this.solar.display();
		}
		else{
			System.out.println("Invalid");
		}
		}
}