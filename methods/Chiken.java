class Chiken{
 static void details(int pieces, double weight, char grade, boolean fresh, float price){
		System.out.println("Chicken Pieces: " + pieces);
        System.out.println("Chicken Weight: " + weight);
        System.out.println("Chicken Grade: " + grade);
        System.out.println("Fresh Chicken: " + fresh);
        System.out.println("Chicken Price: " + price);
    
	
		if (pieces>=4 &&pieces<=10){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (weight>=30 &&weight<=90){
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
		
		if (fresh==true){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (price>=100 && price<=1000){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
}
		
}