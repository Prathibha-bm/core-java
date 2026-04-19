class State {
	
	String name;
	int population;
	City city ;
	
	State(String name,int population,City city){
		this.name=name;
		this.population=population;
		this.city=city;
	}
	
	void info(){
		
		System.out.println("\nRunning in State: ");

		System.out.println("name:"+name);
		System.out.println("population:"+population);
		System.out.println("city:");
		city.info();
		
	}
}