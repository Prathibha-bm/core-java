final class Hospital{

 String name;
 int noOfPatients;
 String type;
 String drName;
 double fees;
 
 Hospital(String name,int noOfPatients,String type,String drName,double fees){
	 this.name=name;
	 this.noOfPatients=noOfPatients;
	 this.type=type;
	 this.drName=drName;
	 this.fees=fees;
	 
	 
			System.out.println("name :"+name);
			System.out.println("noOfPatients :"+noOfPatients);
			System.out.println("type :"+type);
			System.out.println("drName :"+drName);
			System.out.println("fees :"+fees);
						 
  }

}
