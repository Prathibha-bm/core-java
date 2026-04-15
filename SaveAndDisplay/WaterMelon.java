class WaterMelon{

	String color;
    double weight;
    String shape;
    int price;
    boolean isSweet;
    String originCountry;
    int seedsCount;
    double diameter;
    String variety;
    boolean isFresh;

	
	public WaterMelon(String color,double weight,String shape,int price,boolean isSweet,String originCountry,int seedsCount,double diameter,String variety,boolean isFresh){
		
		this.color=color;
		this.weight=weight;
		this.shape=shape;
		this.price=price;
		this.isSweet=isSweet;
		this.originCountry=originCountry;
		this.seedsCount=seedsCount;
		this.diameter=diameter;
		this.variety=variety;
		this.isFresh=isFresh;
	
	}
	
	void info(){	
		System.out.println("Running info in Watermelon");
		
		System.out.println("color: "+this.color);
		System.out.println("weight: "+this.weight);
		System.out.println("shape: "+this.shape);
		System.out.println("price: "+this.price);
		System.out.println("isSweet: "+this.isSweet);
		System.out.println("originCountry: "+this.originCountry);
		System.out.println("seedsCount: "+this.seedsCount);
		System.out.println("diameter: "+this.diameter);
		System.out.println("variety: "+this.variety);
		System.out.println("isFresh: "+this.isFresh);

	}
}