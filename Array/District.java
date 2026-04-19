class District{

	String name;
	Collector collector;
	
	
	District(String name,Collector collector){
		this.name=name;
		this.collector=collector;
		
	}
	
	void info(){
		
		System.out.println("\nRunning in District:");
		System.out.println("Name:"+name);
		System.out.println("Collector:");
		collector.info();
		
	}
}