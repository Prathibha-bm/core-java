class Wheel{
	
String brand;
String type;
String material;
double diameter;
double width;
boolean isTubeless;
boolean hasAlloy;
int wheelId;
double price;
String vehicleType;

public Wheel(String brand,String type,String material,double diameter,double width,boolean isTubeless,boolean hasAlloy,int wheelId,double price,String vehicleType){
	this.brand=brand;
	this.type=type;
	this.material=material;
	this.diameter=diameter;
	this.width=width;
	this.isTubeless=isTubeless;
	this.hasAlloy=hasAlloy;
	this.wheelId=wheelId;
	this.price=price;
	this.vehicleType=vehicleType;
}
}