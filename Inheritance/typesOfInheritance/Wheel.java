// Static polymorphism / CompileTime polymorphism (method Overloading and constructor Overloading)

class Wheel{

String brand;
int size;

//Constructor overloading
public Wheel(String brand){
	this.brand=brand;
	System.out.println("Brand is:"+brand);
}

public Wheel(String brand,int size){
	this.brand=brand;
	this.size=size;
	
	System.out.println("\nBrand is:"+brand);
	System.out.println("size is:"+size);

}
	
//Method Overloading
void rotation(double speed){
	System.out.println("\nRotation speed is :"+speed);
}

void rotation(int price,double speed){
	System.out.println("\nWheel price is :"+price);
	System.out.println("Rotation speed is :"+speed);
	
	
}
	

}