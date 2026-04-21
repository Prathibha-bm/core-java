class Stock{

    int stockId;          
    double openingPrice;  
    double closingPrice;  
    double marketCap;     
    boolean isActive;
	
	Stock(int stockId,double openingPrice,double closingPrice,double marketCap,boolean isActive){
		
		this.stockId=stockId;
		this.openingPrice=openingPrice;
		this.closingPrice=closingPrice;
		this.marketCap=marketCap;
		this.isActive=isActive;
		
		System.out.println("\n Calling Stock constructor in parent class ");
		
			
		}
	
	}