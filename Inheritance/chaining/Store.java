//this chining

class Store{
	
	String type;
	String name;
	int rating;
	String location;
	boolean isAvilableOnline;
	
	Store(String type,String name,int rating,String location,boolean isAvilableOnline){
		
		this.type=type;
		this.name=name;
		this.rating=rating;
		this.location=location;
		this.isAvilableOnline=isAvilableOnline;
		
	}
	
	Store(){
		this("Grocery Store","Sri Ram Stores",8,"Bengalore",true);
			System.out.println("calling constructor1 using this chaining ");
			
			System.out.println("Type :"+type);
			System.out.println("Store name :"+name);
			System.out.println("Rating :"+rating);
			System.out.println("Location :"+location);
			System.out.println("AvilableOnline :"+isAvilableOnline);
			
	}
}