class Silencer {

	String brand;
    String material;
    double length;
    int price;
    boolean noiseReduction;
    String vehicleType;
    int durability;
    double weight;
    String color;
    boolean isOriginal;

	public Silencer(String brand,String material,double length,int price,boolean noiseReduction,String vehicleType,int durability,double weight,String color,boolean isOriginal){

		this.brand = brand;
		this.material = material;
		this.length = length;
		this.price = price;
		this.noiseReduction = noiseReduction;
		this.vehicleType = vehicleType;
		this.durability = durability;
		this.weight = weight;
		this.color = color;
		this.isOriginal = isOriginal;
	}

	void info(){
		System.out.println("Running info in Silencer");

		System.out.println("brand: "+this.brand);
		System.out.println("material: "+this.material);
		System.out.println("length: "+this.length);
		System.out.println("price: "+this.price);
		System.out.println("noiseReduction: "+this.noiseReduction);
		System.out.println("vehicleType: "+this.vehicleType);
		System.out.println("durability: "+this.durability);
		System.out.println("weight: "+this.weight);
		System.out.println("color: "+this.color);
		System.out.println("isOriginal: "+this.isOriginal);
	}
}