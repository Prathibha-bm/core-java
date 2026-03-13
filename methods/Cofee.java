class Cofee{
static void details(int cups, double temperature, char grade, boolean sugar, float price){
        System.out.println("Number of Cups: " + cups);
        System.out.println("Temperature: " + temperature);
        System.out.println("Size: " + grade);
        System.out.println("Sugar Added: " + sugar);
        System.out.println("Price: " + price);

		if (cups>=1 &&cups<=8){
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
		if (grade=='A' &&grade=='A'){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (sugar==true){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (price>=10 &&price<=100){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		
}
		
}
	
	
