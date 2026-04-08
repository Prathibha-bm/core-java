class LaptopMonitor{

String name;
int price;
double rating;
Monitor monitor;

	public LaptopMonitor(String name,int price){
		this.name =name;
		this.price=price;
		
		System.out.println("Brand: "+this.name);
		System.out.println("Price: "+this.price);
		System.out.println("Rating: "+this.rating);//0.0
	}


	void classAsVariable(Monitor monitor){
		System.out.println("Running info in LaptopMonitor");
				System.out.println("Rating: "+this.rating);//0.0

		if(this.monitor!=null){
			this.monitor.info();
		}
		else{
			System.out.println("Invalid");
			
		}	
	}
	
		
}