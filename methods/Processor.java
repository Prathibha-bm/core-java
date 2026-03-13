class Processor{
	static void details(){
		double speed=5;
		int gen=7;
		int storage=125;

		System.out.println("Speed: "+speed);
		System.out.println("Generation: "+gen);
		System.out.println("Storage: "+storage);
	}
		
		static void feature(double speed,int gen,int storage){
		System.out.println("Speed: "+speed);
		System.out.println("Generation: "+gen);
		System.out.println("Storage: "+storage);
		


if (speed>=1 && speed<=10){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}


if (gen>=1 && gen<=13){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
if (storage>=100 && storage<=500){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
	
	}
		
}


