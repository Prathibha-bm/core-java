class WindShield{
    String brand;
    String material;
    double length;
    double width;
    double thickness;
    double price;
    boolean isTinted;
    boolean isShatterProof;
    String vehicleType;
    double weight;
	
	
	public WindShield(){
		System.out.println("No parameters ");
	}

	
    public WindShield(String brand){
        this.brand = brand;
	}
	
		public WindShield(String material, double length, double width){
        this.material = material;
        this.length = length;
        this.width = width;
  }

		public WindShield(double thickness,double price, boolean isTinted){
			
        this.thickness = thickness;
        this.price = price;
        this.isTinted = isTinted;
		}
		
		public WindShield( boolean isShatterProof, String vehicleType){
					  
        this.isShatterProof = isShatterProof;
        this.vehicleType = vehicleType;
		}
		

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("material: " + material);
        System.out.println("length: " + length);
        System.out.println("width: " + width);
        System.out.println("thickness: " + thickness);
        System.out.println("price: $" + price);
        System.out.println("isTinted: " + isTinted);
        System.out.println("isShatterProof: " + isShatterProof);
        System.out.println("vehicleType: " + vehicleType);
        System.out.println("weight: " + weight + " kg");
        System.out.println("..................");
    }
}
