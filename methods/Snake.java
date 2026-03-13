class Snake{

	static void name(){
		System.out.println("King Cobra");
	}
	
	static void length(){
		System.out.println("up to "+10+"-"+13+"meter");
	}
	
	static void weight(){
		System.out.println("5-10kg");
		length();
	}
	
	static void scientificName(){
		System.out.println("Ophiophagus hannah");
	}
	
	static void lifeSpan(){
		System.out.println("15 to 20 years");
		name();
		scientificName();
	}
}
