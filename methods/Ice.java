class Ice{
static void details(int cubes,double temperature, char grade, boolean frozen, float weight){
        System.out.println("Ice Cubes: " + cubes);
        System.out.println("Temperature: " + temperature);
        System.out.println("Ice Grade: " + grade);
        System.out.println("Frozen: " + frozen);
        System.out.println("Ice Weight: " + weight);
    
		if (cubes>=1 &&cubes<=10){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (temperature>=30 &&temperature<=90){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		if (grade=='A'){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (frozen==true){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (weight>=100 &&weight<=1000){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
}
		
}