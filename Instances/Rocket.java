class Rocket{
	
	String rocketName;
	String manufacturer;
	double height;
	double weight;
	double fuelCapacity;
	int numberOfStages;
	double payloadCapacity;
	boolean isReusable;
	String fuelheight;
	double launchSpeed;
		
		
public Rocket(String rocketName,String manufacturer,double height,double weight,double fuelCapacity,int numberOfStages,double payloadCapacity,boolean isReusable,String fuelheight,double launchSpeed)
{
			this.rocketName=rocketName;
			this.manufacturer=manufacturer;
			this.height=height;
			this.fuelCapacity=fuelCapacity;
			this.numberOfStages=numberOfStages;
			this.weight=weight;
			this.payloadCapacity=payloadCapacity;
			this.isReusable=isReusable;
			this.fuelheight=fuelheight;
			this.launchSpeed=launchSpeed;
			
			
}
			
void showMethod(){
	System.out.println("rocketName:"+rocketName);
	System.out.println("manufacturer:"+manufacturer);
	System.out.println("fuelCapacity:"+fuelCapacity);
	System.out.println("payloadCapacity:"+payloadCapacity);
	System.out.println("height:"+height);
	System.out.println("numberOfStages:"+numberOfStages);
	System.out.println("weight:"+weight);
	System.out.println("isReusable:"+isReusable);
	System.out.println("fuelheight:"+fuelheight);
	System.out.println("launchSpeed:"+launchSpeed);
	System.out.println("..................");
			
			
		}
}