class RestaurantRun{

public static void main(String[] args){
	
	RestaurantChild instance1=new RestaurantChild();
	
	instance1.display("Sri Ram");
	instance1.display(7.6);
	instance1.display(7.6,"Vijayanagara");
	instance1.display(7.6,"Vijayanagara",true);
	instance1.display("Vijayanagara",true);
	
	
	RestaurantChild instance2=new RestaurantChild();
	
	instance2.display("Chandana");
	instance2.display(8.9);
	instance2.display(8.9,"RajajiNagara");
	instance2.display(8.9,"RajajiNagara",false);
	instance2.display("RajajiNagara",false);
	
	
}
}