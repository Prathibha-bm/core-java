class InkPad{
    String brand;
    String color;
    double length;
    double width;
    double price;
    boolean isReusable;
    String material;
    boolean isNonToxic;
    String shape;
    double weight;

    public InkPad(){
	}
					  
	public InkPad(String brand){
        this.brand = brand;
	}
		
	public InkPad(String color,double length){
		  
		this.color = color;
        this.length = length;
	}
					  
	public InkPad(double width, double price){
		
        this.width = width;
        this.price = price;
	}
					  
					  
	public InkPad(boolean isNonToxic, String shape, double weight){
		
       this.isNonToxic = isNonToxic;
        this.shape = shape;
        this.weight = weight;
		
	}
			  
    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("price: $" + price);
        System.out.println("isReusable: " + isReusable);
        System.out.println("material: " + material);
        System.out.println("isNonToxic: " + isNonToxic);
        System.out.println("shape: " + shape);
        System.out.println("weight: " + weight + " kg");
        System.out.println("..................");
    }
}