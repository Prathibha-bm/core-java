class SoftDrink {
    String brand;
    String flavor;
    double volume;
    double price;
    boolean isCarbonated;
    boolean isSugarFree;
    String packaging;
    double temperature;
    int calories;
    boolean isCaffeinated;

    public SoftDrink(){
	}
		
	public SoftDrink(String brand){
        this.brand=brand;
	}
		
	public SoftDrink(String flavor, double volume){	
        this.flavor = flavor;
        this.volume = volume;
	}
		
	public SoftDrink( double price,boolean isCarbonated, boolean isSugarFree){
        this.price = price;
        this.isCarbonated = isCarbonated;
        this.isSugarFree = isSugarFree;
	}
		
	public SoftDrink(String packaging,double temperature,int calories,boolean isCaffeinated){
        this.packaging = packaging;
        this.temperature = temperature;
        this.calories = calories;
        this.isCaffeinated = isCaffeinated;
    }

    void showMethod() {
        System.out.println("brand: " + brand);
        System.out.println("flavor: " + flavor);
        System.out.println("volume: " + volume + " L");
        System.out.println("price: $" + price);
        System.out.println("isCarbonated: " + isCarbonated);
        System.out.println("isSugarFree: " + isSugarFree);
        System.out.println("packaging: " + packaging);
        System.out.println("temperature: " + temperature + " °C");
        System.out.println("calories: " + calories);
        System.out.println("isCaffeinated: " + isCaffeinated);
        System.out.println("..................");
    }
}