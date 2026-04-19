class Country{
	
	String name;
	President president;
	State[] states;
	
	Country(String name,President president,State[] states){
		this.name=name;
		this.president=president;
		this.states=states;
	}
	
	void info(){
		System.out.println("\nRunning in country: ");
		
		System.out.println("Name:"+name);
		
		System.out.println("President:.....");
		president.info();
		System.out.println("Running in president is completed here\n");
		
		System.out.println("States:");
		
		for(int i=0;i<states.length;i++){
			states[i].info();
		}
		
	}
	
	
}

