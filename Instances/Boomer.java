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
		
public Boomer(int boomerId,String material, String shape, String color,double range,double capacity,double length,String brand,boolean numberOfCompartments,boolean isHandcrafted){
	
			this.boomerId=boomerId;
			this.shape=shape;
			this.material=material;
			this.color=color;
			this.capacity=capacity;
			this.length=length;
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