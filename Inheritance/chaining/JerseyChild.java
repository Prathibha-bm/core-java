class JerseyChild extends Jersey{


	JerseyChild(String color,String team,int jerseyNo,double price,String brand){
	super(color,team,jerseyNo,price,brand);
	
	System.out.println("\nInheriting from parentClass Jersey by subclass using super chaining");
	        System.out.println("color :"+color);
			System.out.println("team :"+team);
			System.out.println("jerseyNo :"+jerseyNo);
			System.out.println("price :"+price);
			System.out.println("brand :"+brand);
	}

}