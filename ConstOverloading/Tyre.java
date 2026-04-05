class Tyre{
    String brand;
    double diameter;
    double width;
    String type;
    double price;
    boolean isTubeless;
    String material;
    double weight;
    String vehicleType;
    boolean isAllSeason;

	public Tyre() {
		System.out.println("no parameter");
	}
	
					
    public Tyre(String brand) {
        this.brand = brand;
		
	}
	
	public Tyre(double diameter, double width) {
        this.diameter = diameter;
        this.width = width;
	}
	
		
	public Tyre( String type, double price,
                boolean isTubeless) {
					
        this.type = type;
        this.price = price;
        this.isTubeless = isTubeless;
				}
				
		
	public Tyre(String material, double weight, String vehicleType, boolean isAllSeason) {
        this.material = material;
        this.weight = weight;
        this.vehicleType = vehicleType;
        this.isAllSeason = isAllSeason;
    }
	

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("diameter: " + diameter);
        System.out.println("width: " + width);
        System.out.println("type: " + type);
        System.out.println("price: $" + price);
        System.out.println("isTubeless: " + isTubeless);
        System.out.println("material: " + material);
        System.out.println("weight: " + weight + " kg");
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("isAllSeason: " + isAllSeason);
        System.out.println("..................");
    }
}
