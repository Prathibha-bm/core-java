class SugarFactory{
	
	String factoryName;
	int since;
	String location;
	SugarCane sugarCane;
	
	SugarFactory(String factoryName,int since)
	{
		this.factoryName=factoryName;
		this.since=since;
		
		System.out.println("FactoryName: " + this.factoryName);
        System.out.println("Since: " + this.since);
        System.out.println("Location: " + this.location);
		
	}
	
	void display(){
		System.out.println("Running info in factory");
		if(this.sugarCane!=null){
			this.sugarCane.info();
		}
		else{
			System.out.println("Invalid");
		}
		}
}