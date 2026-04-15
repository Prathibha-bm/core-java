class Laser{

	String type;
    double power;
    String color;
    boolean isPortable;
    int price;
    String usage;
    int range;
    String brand;
    double weight;
    boolean isIndustrial;
	

	public Laser(String type,double power,String color,boolean isPortable,int price,String usage,
                 int range,String brand,double weight,boolean isIndustrial){

		this.type = type;
		this.power = power;
		this.color = color;
		this.isPortable = isPortable;
		this.price = price;
		this.usage = usage;
		this.range = range;
		this.brand = brand;
		this.weight = weight;
		this.isIndustrial = isIndustrial;
	}

	void info(){

		System.out.println("Running info in Laser");

		System.out.println("type: "+this.type);
		System.out.println("power: "+this.power);
		System.out.println("color: "+this.color);
		System.out.println("isPortable: "+this.isPortable);
		System.out.println("price: "+this.price);
		System.out.println("usage: "+this.usage);
		System.out.println("range: "+this.range);
		System.out.println("brand: "+this.brand);
		System.out.println("weight: "+this.weight);
		System.out.println("isIndustrial: "+this.isIndustrial);
	}
}