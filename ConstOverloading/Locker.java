class Locker{
	
int lockerId;
String lockerType;
String material;
String color;
double capacity;
boolean isDigital;
String brand;
int numberOfCompartments;
double weight;
boolean isFireResistant;
		
public Locker(){
}
	
public Locker(int lockerId){
			this.lockerId=lockerId;
}
			
public Locker(String lockerType, String material){
			this.lockerType=lockerType;
			this.material=material;
}
			
public Locker( String color,double capacity, boolean isDigital){
			this.color=color;
			this.capacity=capacity;
			this.isDigital=isDigital;
}
			
public Locker(String brand,int numberOfCompartments, double weight, boolean isFireResistant){
			this.brand=brand;
			this.numberOfCompartments=numberOfCompartments;
			this.weight=weight;
			this.isFireResistant=isFireResistant;
}
void showMethod(){
	System.out.println("lockerId:"+lockerId);
	System.out.println("lockerType:"+lockerType);
	System.out.println("material:"+material);
	System.out.println("color:"+color);
	System.out.println("capacity:"+capacity);
	System.out.println("isDigital:"+isDigital);
	System.out.println("brand:"+brand);
	System.out.println("weight:"+weight);
	System.out.println("isFireResistant:"+isFireResistant);
	System.out.println("..................");
			
		}
}