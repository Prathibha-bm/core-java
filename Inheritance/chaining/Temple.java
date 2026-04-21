class Temple{
    final String name;
    final String location;
    final int distanceInKm;
    final int yearBuilt;
	final boolean isOpen;
	
	Temple(String name,String location,int distanceInKm,int yearBuilt,boolean isOpen){
		this.name=name;
		this.location=location;
		this.distanceInKm=distanceInKm;
		this.yearBuilt=yearBuilt;
		this.isOpen=isOpen;
		
	}
	
	Temple(){
		this("Rama Manddira","Rajajinagara",6,1987,true);
		
		System.out.println("name :"+name);
		System.out.println("location :"+location);
		System.out.println("distanceInKm :"+distanceInKm);
		System.out.println("yearBuilt :"+yearBuilt);
		System.out.println("isOpen :"+isOpen);
	

	}
}