//this chining

class Coin{
	
	String name;        
    String country;     
    int value;       
    String material;    
    int yearMinted;  

	Coin(String name,String country,int value,String material,int yearMinted){
		
		this.name=name;
		this.country=country;
		this.value=value;
		this.material=material;
		this.yearMinted=yearMinted;
		
	}
	
	Coin(){
		this("Rupee","India",80,"Silver",1856);
			System.out.println("calling constructor1 using this chaining ");
			
			System.out.println("Name :"+name);
			System.out.println("Store country :"+country);
			System.out.println("value :"+value);
			System.out.println("material :"+material);
			System.out.println("yearMinted :"+yearMinted);
			
	}
}