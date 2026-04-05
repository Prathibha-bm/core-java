class Locket{

String material;
String shape;
String color;
double weight;
double size;
boolean hasPhoto;
String brand;
String chainType;
boolean isGoldPlated;
int locketID;

public Locket(){
}


public Locket(String material){
this.material=material;
}

public Locket(String shape,String color){
this.shape=shape;
this.color=color;
}


public Locket(double weight,double size,boolean hasPhoto){
this.weight=weight;
this.size=size;
this.hasPhoto=hasPhoto;
}


public Locket(String brand,String chainType,boolean isGoldPlated,int locketID){
this.brand=brand;
this.chainType=chainType;
this.isGoldPlated=isGoldPlated;
this.locketID=locketID;
}

void show(){
	System.out.println("material:"+material);
	System.out.println("shape:"+shape);
	System.out.println("color:"+color);
	System.out.println("weight:"+weight);
	System.out.println("size:"+size);
	System.out.println("hasPhoto:"+hasPhoto);
	System.out.println("brand:"+brand);
	System.out.println("chainType:"+chainType);
	System.out.println("isGoldPlated:"+isGoldPlated);
	System.out.println("locketID:"+locketID);
	System.out.println("................................");
}
}
