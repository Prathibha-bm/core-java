class Bell{
static void details(int size, double weight, char grade, boolean isElectric, int price){
        System.out.println("Bell Size: " + size);
        System.out.println("Bell Weight: " + weight);
        System.out.println("Bell Grade: " + grade);
        System.out.println("Electric Bell: " + isElectric);
        System.out.println("Bell Price: " + price);
		
		
		if (size>=40 &&size<=100){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (weight>=1 &&weight<=10){
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
		if (isElectric>=40 &&isElectric<=100){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		if (price>=400 &&price<=1000){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}			
}
		
}
