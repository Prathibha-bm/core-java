class FishTank{

String material;
double capacity;
double length;
double width;
double height;
String shape;
boolean hasFilter;
boolean hasLight;
int tankId;
boolean isSaltWater;
String brand;

public FishTank(String material,double capacity,double length,double width,double height,String shape,boolean hasFilter,boolean hasLight,int tankId,boolean isSaltWater,String brand){

this.material=material;
this.capacity=capacity;
this.length=length;
this.width=width;
this.height=height;
this.shape=shape;
this.hasFilter=hasFilter;
this.hasLight=hasLight;
this.tankId=tankId;
this.isSaltWater=isSaltWater;
this.brand=brand;
}
}