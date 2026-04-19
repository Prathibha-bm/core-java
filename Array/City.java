class City{
	
	String name;
	int noOfDistricts;
	District[] districts;
	
	
	City(String name,int noOfDistricts,District[] districts){
		this.name=name;
		this.noOfDistricts=noOfDistricts;
		this.districts=districts;
	}
	
	void info(){
		
		System.out.println("\nRunning in City:");
		System.out.println("name:"+name);
		System.out.println("noOfDistricts:"+noOfDistricts);
		System.out.println("district:");
		
        for(int i=0;i<districts.length;i++){
            districts[i].info();
		
	}
}
}