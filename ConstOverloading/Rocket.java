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
		
		
public Rocket()
{
}
	
public Rocket(String rocketName){
			this.rocketName=rocketName;
}
public Rocket(String manufacturer,double height){
			this.manufacturer=manufacturer;
			this.height=height;
}
			
public Rocket(double weight,double fuelCapacity,int numberOfStages){
			this.fuelCapacity=fuelCapacity;
			this.numberOfStages=numberOfStages;
			this.weight=weight;
}
			
public Rocket(double payloadCapacity,boolean isReusable,String fuelheight,double launchSpeed){
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