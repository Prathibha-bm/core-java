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

    public SoftDrink(String brand, String flavor, double volume, double price,boolean isCarbonated, boolean isSugarFree, String packaging,double temperature,int calories,boolean isCaffeinated){
        this.brand = brand;
        this.flavor = flavor;
        this.volume = volume;
        this.price = price;
        this.isCarbonated = isCarbonated;
        this.isSugarFree = isSugarFree;
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