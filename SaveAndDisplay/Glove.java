class Glove {

	String material;
    String size;
    double length;
    int price;
    boolean isWaterProof;
    String usageType;
    int durability;
    String color;
    boolean isReusable;
    String brand;

	public Glove(String material,String size,double length,int price,boolean isWaterProof,
                 String usageType,int durability,String color,boolean isReusable,String brand){

		this.material = material;
		this.size = size;
		this.length = length;
		this.price = price;
		this.isWaterProof = isWaterProof;
		this.usageType = usageType;
		this.durability = durability;
		this.color = color;
		this.isReusable = isReusable;
		this.brand = brand;
	}

	void info(){

		System.out.println("Running info in Glove");

		System.out.println("material: "+this.material);
		System.out.println("size: "+this.size);
		System.out.println("length: "+this.length);
		System.out.println("price: "+this.price);
		System.out.println("isWaterProof: "+this.isWaterProof);
		System.out.println("usageType: "+this.usageType);
		System.out.println("durability: "+this.durability);
		System.out.println("color: "+this.color);
		System.out.println("isReusable: "+this.isReusable);
		System.out.println("brand: "+this.brand);
	}
}