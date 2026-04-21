class Jersey{

    String color;          
    String team;  
    int  jerseyNo;  
    double price;     
    String brand;
	
	Jersey(String color,String team,int jerseyNo,double price,String brand){
		
		this.color=color;
		this.team=team;
		this.jerseyNo=jerseyNo;
		this.price=price;
		this.brand=brand;
		
		System.out.println("\n Calling Jersey constructor in parent class ");
		
			
		}
	
	}