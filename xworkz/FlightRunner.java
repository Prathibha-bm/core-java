class FlightRunner{

	public static void main(String[] args){
		Flight instance1=new Flight();
		Flight instance2=new Flight();
		Flight instance3=new Flight();
		Flight instance4=new Flight();
		Flight instance5=new Flight();

        System.out.println("\n--- Default Values ---");

        System.out.println("\nFlight 1");
        System.out.println("Name: " + instance1.name);
        System.out.println("ArrivalTime: " + instance1.arrivalTime);
        System.out.println("Capacity: " + instance1.capacity);
        System.out.println("Price: " + instance1.price);
        System.out.println("DepartureTime: " + instance1.departureTime);

        System.out.println("\nFlight 2");
        System.out.println("Name: " + instance2.name);
        System.out.println("ArrivalTime: " + instance2.arrivalTime);
        System.out.println("Capacity: " + instance2.capacity);
        System.out.println("Price: " + instance2.price);
        System.out.println("DepartureTime: " + instance2.departureTime);

        System.out.println("\nFlight 3");
        System.out.println("Name: " + instance3.name);
        System.out.println("ArrivalTime: " + instance3.arrivalTime);
        System.out.println("Capacity: " + instance3.capacity);
        System.out.println("Price: " + instance3.price);
        System.out.println("DepartureTime: " + instance3.departureTime);

        System.out.println("\nFlight 4");
        System.out.println("Name: " + instance4.name);
        System.out.println("ArrivalTime: " + instance4.arrivalTime);
        System.out.println("Capacity: " + instance4.capacity);
        System.out.println("Price: " + instance4.price);
        System.out.println("DepartureTime: " + instance4.departureTime);

        System.out.println("\nFlight 5");
        System.out.println("Name: " + instance5.name);
        System.out.println("ArrivalTime: " + instance5.arrivalTime);
        System.out.println("Capacity: " + instance5.capacity);
        System.out.println("Price: " + instance5.price);
        System.out.println("DepartureTime: " + instance5.departureTime);

        // Assign values for each flight instance
        instance1.name = "Air India";
        instance1.arrivalTime = "12:00 am";
        instance1.capacity = 800;
        instance1.price = 90000;
        instance1.departureTime = "4:00 am";

        instance2.name = "IndiGo";
        instance2.arrivalTime = "1:30 pm";
        instance2.capacity = 750;
        instance2.price = 85000;
        instance2.departureTime = "5:30 pm";

        instance3.name = "SpiceJet";
        instance3.arrivalTime = "6:45 am";
        instance3.capacity = 600;
        instance3.price = 70000;
        instance3.departureTime = "9:15 am";

        instance4.name = "GoAir";
        instance4.arrivalTime = "11:00 am";
        instance4.capacity = 500;
        instance4.price = 65000;
        instance4.departureTime = "2:00 pm";

        instance5.name = "Vistara";
        instance5.arrivalTime = "8:00 pm";
        instance5.capacity = 550;
        instance5.price = 75000;
        instance5.departureTime = "11:00 pm";

        System.out.println("\n--- Updated Values ---");

        System.out.println("\nFlight 1");
        System.out.println("Name: " + instance1.name);
        System.out.println("ArrivalTime: " + instance1.arrivalTime);
        System.out.println("Capacity: " + instance1.capacity);
        System.out.println("Price: " + instance1.price);
        System.out.println("DepartureTime: " + instance1.departureTime);

        System.out.println("\nFlight 2");
        System.out.println("Name: " + instance2.name);
        System.out.println("ArrivalTime: " + instance2.arrivalTime);
        System.out.println("Capacity: " + instance2.capacity);
        System.out.println("Price: " + instance2.price);
        System.out.println("DepartureTime: " + instance2.departureTime);

        System.out.println("\nFlight 3");
        System.out.println("Name: " + instance3.name);
        System.out.println("ArrivalTime: " + instance3.arrivalTime);
        System.out.println("Capacity: " + instance3.capacity);
        System.out.println("Price: " + instance3.price);
        System.out.println("DepartureTime: " + instance3.departureTime);

        System.out.println("\nFlight 4");
        System.out.println("Name: " + instance4.name);
        System.out.println("ArrivalTime: " + instance4.arrivalTime);
        System.out.println("Capacity: " + instance4.capacity);
        System.out.println("Price: " + instance4.price);
        System.out.println("DepartureTime: " + instance4.departureTime);

        System.out.println("\nFlight 5");
        System.out.println("Name: " + instance5.name);
        System.out.println("ArrivalTime: " + instance5.arrivalTime);
        System.out.println("Capacity: " + instance5.capacity);
        System.out.println("Price: " + instance5.price);
        System.out.println("DepartureTime: " + instance5.departureTime);
    }
}