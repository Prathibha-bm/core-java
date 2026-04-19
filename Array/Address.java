class Address{
	
	int no;
	int pincode;
	State state;
	
	Address(int no,int pincode,State state){
		this.no=no;
		this.pincode=pincode;
		this.state=state;
	}
	
	

	void info(){
		
		System.out.println("\nRunning in Address: ");

		System.out.println("no:"+no);
		System.out.println("pincode:"+pincode);
		System.out.println("State:");
		state.info();
	}
	
}