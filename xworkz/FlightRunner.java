class FlightRunner{

	public static void main(String[] args){
		Flight instance1=new Flight();
		Flight instance2=new Flight();
		Flight instance3=new Flight();
		Flight instance4=new Flight();
		Flight instance5=new Flight();
		
		System.out.println("\nDefault Values are:");
		
		System.out.println("Capacity:"+instance1.name);
		System.out.println("ArrivalTime:"+instance2.arrivalTime);
		System.out.println("Aapacity:"+instance3.capacity);
		System.out.println("Price:"+instance4.price);
		System.out.println("DipartureTime:"+instance5.dipartureTime);

		instance1.name="Air India";
		instance2.arrivalTime="12.00am";
		instance3.capacity=800;
		instance4.price=90000;
		instance5.dipartureTime="4.00am";
		
		 
		System.out.println("\n Updated Values are:");

		System.out.println("Capacity:"+instance1.name);
		System.out.println("ArrivalTime:"+instance2.arrivalTime);
		System.out.println("Aapacity:"+instance3.capacity);
		System.out.println("Price:"+instance4.price);
		System.out.println("DipartureTime:"+instance5.dipartureTime);

	
	}
}