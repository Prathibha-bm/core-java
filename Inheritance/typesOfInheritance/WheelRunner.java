class WheelRunner{
public static void main(String... values){
	
	
	System.out.println("\n......Static polymorphism / CompileTime polymorphism........");
	System.out.println("\n=====Constructor Overloading=====");
	Wheel wheel=new Wheel("Appolo");
	Wheel wheel1=new Wheel("Appolo",60);
	
	System.out.println("\n=====Method Overloading=====");
	wheel.rotation(28.9);
	wheel.rotation(3000,28.9);

	
	
	
	
	
}
}