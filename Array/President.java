class President{

	String name;
	int age;
	Address address;
	
	President(String name,int age,Address address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	
	void info(){
		System.out.println("\nRunning in President: ");
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("address:....");
		
		address.info();
		
		
	}
	
	
}