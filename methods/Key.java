class Key{
static void details(int length, double weight, char type, boolean masterKey, float price){
        System.out.println("Key Length: " + length);
        System.out.println("Key Weight: " + weight);
        System.out.println("Key Type: " + type);
        System.out.println("Master Key: " + masterKey);
        System.out.println("Key Price: " + price);
		
		if (length>=4 &&length<=10){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (weight>=30 &&weight<=100){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		if (type=='A'){
			System.out.println("Is Valid");
		}
		
		else{
			System.out.println("Is Invalid");
		}
		
		if (masterKey==true){
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
