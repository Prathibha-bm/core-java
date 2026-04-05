class Umbrella{
    String brand;
    String color;
    double length;
    double canopyDiameter;
    boolean isAutomatic;
    boolean isWindResistant;
    String material;
    double weight;
    double price;
    String type;

public Umbrella() {
}
	
public Umbrella(String brand) {
        this.brand=brand;
}
		
public Umbrella( String color, double length) {
        this.color=color;
		this.length=length;
}

		
public Umbrella( double canopyDiameter, boolean isAutomatic, boolean isWindResistant) {
        this.canopyDiameter=canopyDiameter;
        this.isAutomatic=isAutomatic;
        this.isWindResistant=isWindResistant;
}

		
public Umbrella(String material,double weight, double price, String type) {
        this.material=material;
        this.weight=weight;
        this.price=price;
        this.type=type;
    }

    void showMethod(){
        System.out.println("brand: "+brand);
        System.out.println("color: "+color);
        System.out.println("length: "+length);
        System.out.println("canopyDiameter: "+canopyDiameter);
        System.out.println("isAutomatic: "+isAutomatic);
        System.out.println("isWindResistant: "+isWindResistant);
        System.out.println("material: "+material);
        System.out.println("weight: "+weight+" kg");
        System.out.println("price: $"+price);
        System.out.println("type: "+type);
        System.out.println("..................");
    }
}
