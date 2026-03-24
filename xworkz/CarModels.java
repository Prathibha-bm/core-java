class CarModels{
	
	public static void main(String[] args){
		
		String modelName1="Toyota Corolla";
		String modelName2="Honda Civic";
		String modelName3="Maruti Suzuki Swift";
		String modelName4="Hyundai i20";
		String modelName5="Volkswagen Golf";
		String modelName6="Tesla Model 3";
		String modelName7="Skoda Octavia ";
		String modelName8="Honda City ";
		String modelName9="Toyota Fortuner";
		String modelName10="Hyundai Creta";
		String modelName11="Luger P08";
		String modelName12="Mahindra Thar";
		String modelName13="Tata Nexon";
		String modelName14="Ford Endeavour";
		String modelName15="Jeep Wrangler ";
		String modelName16="Kia Seltos";
		String modelName17="Toyota Innova Crysta";
		String modelName18="Mercedes-Benz S-Class";
		String modelName19="BMW 3 Series";
		String modelName20="Maruthi 800";
		String modelName21="Lamborghini Aventador";
		String modelName22="Land Rover Range Rover";
		String modelName23="Jaguar F-Type";
		String modelName24="BMW 3 Series";
		String modelName25="Audi A4";
		
		
		
	
			String[] modelsName={modelName1,modelName2,modelName3,modelName4,modelName5,modelName6,modelName7,modelName8,modelName9,modelName10,modelName11,modelName12,modelName13,modelName14,modelName15,modelName16,modelName17,modelName18,modelName19,modelName20,modelName21,modelName22,modelName23,modelName24,modelName25};
			
			modelsName[5]="Bugatti Chiron";
			
			for(int model=0;model<=24;model++){
			System.out.println(modelsName[model]);
			}
			
			System.out.println("\n Reverse :\n");
			
			for(int model=24;model>=0;model--){
			System.out.println(modelsName[model]);
			}
			
			String item2=modelsName[26];	
		}
}
