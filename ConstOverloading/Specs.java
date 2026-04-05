class Specs{
	int id;
	float power;
	String brand;
	String type;
	boolean isGlass;
	String frameStyle;
	String color;
	int size;
	int cost;
	boolean isSunglass;
	

public Specs(){
}

public Specs(int id){
	this.id=id;
}

public Specs(float power,String brand){
	this.power=power;
	this.brand=brand;
	
}

public Specs(String type,boolean isGlass,String frameStyle){
	this.type=type;
	this.isGlass=isGlass;
	this.frameStyle=frameStyle;
	
}
public Specs(String color,int size,int cost,boolean isSunglass){
	this.color=color;
	this.size=size;
	this.cost=cost;
	this.isSunglass=isSunglass;
	
}

void showMethod(){
	System.out.println("id:"+id);
	System.out.println("power:"+power);
	System.out.println("color:"+color);
	System.out.println("brand:"+brand);
	System.out.println("type:"+type);
	System.out.println("isGlass:"+isGlass);
	System.out.println("frameStyle:"+frameStyle);
	System.out.println("color:"+color);
	System.out.println("size:"+size);
	System.out.println("cost:"+cost);
	System.out.println("isSunglass:"+isSunglass);
	System.out.println("..................");
}
}

