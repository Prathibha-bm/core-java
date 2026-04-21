//this chining

class Candle{
	
	double price;        
    double heightInCm;       
    String shape;      
    String material;     
    int burnTime;    

	Candle(double price,double heightInCm,String shape,String material,int burnTime){
		
		this.price=price;
		this.heightInCm=heightInCm;
		this.shape=shape;
		this.material=material;
		this.burnTime=burnTime;
		
	}
	
	Candle(){
		this(200,20,"Pillar","Paraffin",2);
			System.out.println("calling constructor1 using this chaining ");
			
			System.out.println("price :"+price);
			System.out.println("heightInCm :"+heightInCm);
			System.out.println("shape :"+shape);
			System.out.println("material :"+material);
			System.out.println("burnTime :"+burnTime);
			
	}
}