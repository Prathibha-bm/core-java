class Boomer{

int boomerId;
String material;
String shape;
String color;
double range;
double capacity;
double length;
String brand;
boolean numberOfCompartments;
boolean isHandcrafted;
		
public Boomer(){
}
	
public Boomer(int boomerId){
			this.boomerId=boomerId;
}
			
			
public Boomer(String material, String shape){
			this.shape=shape;
			this.material=material;
			
}
			
public Boomer(String color,double range,double capacity){
			this.color=color;
			this.capacity=capacity;
			this.length=length;
}
			
			
			
public Boomer(double length,String brand,boolean numberOfCompartments,boolean isHandcrafted){
			this.brand=brand;
			this.numberOfCompartments=numberOfCompartments;
			this.range=range;
			this.isHandcrafted=isHandcrafted;
}
			
void showMethod(){
	System.out.println("boomerId:"+boomerId);
	System.out.println("shape:"+shape);
	System.out.println("material:"+material);
	System.out.println("color:"+color);
	System.out.println("capacity:"+capacity);
	System.out.println("length:"+length);
	System.out.println("brand:"+brand);
	System.out.println("range:"+range);
	System.out.println("isHandcrafted:"+isHandcrafted);
	System.out.println("..................");
		}
}