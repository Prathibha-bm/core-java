class Chain{
	int id;
    String material;
    String type;
    String color;
    double length;
    double weight;
    String brand;
    boolean isGoldPlated;
    double price;
    String claspType;
		
		
public Chain(){
	
}

public Chain(int id){
			this.id=id;
}
			
public Chain(String material, String type){
			this.material=material;
			this.type=type;
}
			
public Chain(String color,double length,double weight){
			this.color=color;
			this.length=length;
			this.weight=weight;
}
			
public Chain(String brand,boolean isGoldPlated,double price, String claspType){
			this.brand=brand;
			this.isGoldPlated=isGoldPlated;
			this.price=price;
			this.claspType=claspType;		
}
			
void showMethod(){
	System.out.println("id:"+id);
	System.out.println("material:"+material);
	System.out.println("color:"+color);
	System.out.println("brand:"+brand);
	System.out.println("type:"+type);
	System.out.println("length:"+length);
	System.out.println("weight:"+weight);
	System.out.println("isGoldPlated:"+isGoldPlated);
	System.out.println("price:"+price);
	System.out.println("claspType:"+claspType);
	System.out.println("..................");
			
		}
}