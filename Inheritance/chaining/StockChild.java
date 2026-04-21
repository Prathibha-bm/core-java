class StockChild extends Stock{


	StockChild(int stockId,double openingPrice,double closingPrice,double marketCap,boolean isActive){
	super(stockId,openingPrice,closingPrice,marketCap,isActive);
	
	System.out.println("\nInheriting from parentClass Stock by subclass using super chaining");
	        System.out.println("stockId :"+stockId);
			System.out.println("openingPrice :"+openingPrice);
			System.out.println("closingPrice :"+closingPrice);
			System.out.println("marketCap :"+marketCap);
			System.out.println("isActive :"+isActive);
	}

}