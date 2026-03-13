class District{
	static void run(){
		taxing();
		
	}
	static void taxing(){
		System.out.println("tax");
		measure();
		
	}
	static void measure(){
		System.out.println("Measure");
		collect();
		
	} 
	
	static void collect(){
		System.out.println("collect");
		revenue();
		
	}
	static void revenue(){
		System.out.println("revenue");
		budget();
		
	}
	static void budget(){
		System.out.println("budget");
	}
} 