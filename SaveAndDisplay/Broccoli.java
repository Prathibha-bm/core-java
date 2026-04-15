class Broccoli {

	String color;
    double weight;
    String shape;
    int price;
    boolean isOrganic;
    String originCountry;
    int vitaminsLevel;
    double diameter;
    String variety;
    boolean isFresh;

	public Broccoli(String color,double weight,String shape,int price,boolean isOrganic,
                    String originCountry,int vitaminsLevel,double diameter,String variety,boolean isFresh){

		this.color = color;
		this.weight = weight;
		this.shape = shape;
		this.price = price;
		this.isOrganic = isOrganic;
		this.originCountry = originCountry;
		this.vitaminsLevel = vitaminsLevel;
		this.diameter = diameter;
		this.variety = variety;
		this.isFresh = isFresh;
	}

	void info(){

		System.out.println("Running info in Broccoli");

		System.out.println("color: "+this.color);
		System.out.println("weight: "+this.weight);
		System.out.println("shape: "+this.shape);
		System.out.println("price: "+this.price);
		System.out.println("isOrganic: "+this.isOrganic);
		System.out.println("originCountry: "+this.originCountry);
		System.out.println("vitaminsLevel: "+this.vitaminsLevel);
		System.out.println("diameter: "+this.diameter);
		System.out.println("variety: "+this.variety);
		System.out.println("isFresh: "+this.isFresh);
	}
}