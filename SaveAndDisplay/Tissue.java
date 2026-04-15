class Tissue{

	String brand;
    int packCount;
    String type;
    boolean isSoft;
    int price;
    double thickness;
    String fragrance;
    boolean isWet;
    String color;
    String material;

	public Tissue(String brand,int packCount,String type,boolean isSoft,int price,double thickness,
                  String fragrance,boolean isWet,String color,String material){

		this.brand = brand;
		this.packCount = packCount;
		this.type = type;
		this.isSoft = isSoft;
		this.price = price;
		this.thickness = thickness;
		this.fragrance = fragrance;
		this.isWet = isWet;
		this.color = color;
		this.material = material;
	}

	void info(){

		System.out.println("Running info in Tissue");

		System.out.println("brand: "+this.brand);
		System.out.println("packCount: "+this.packCount);
		System.out.println("type: "+this.type);
		System.out.println("isSoft: "+this.isSoft);
		System.out.println("price: "+this.price);
		System.out.println("thickness: "+this.thickness);
		System.out.println("fragrance: "+this.fragrance);
		System.out.println("isWet: "+this.isWet);
		System.out.println("color: "+this.color);
		System.out.println("material: "+this.material);
	}
}