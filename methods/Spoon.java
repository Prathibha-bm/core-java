class Spoon{
	static void details(){
		double weight=5;
		int price=7;
		int length=10;

		System.out.println("weight: "+weight);
		System.out.println("priceeration: "+price);
		System.out.println("length: "+length);
	}
		
		static void feature(double weight,int price,float length){
		System.out.println("weight: "+weight);
		System.out.println("priceeration: "+price);
		System.out.println("length: "+length);
		


if (weight>=1 && weight<=10){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}


if (price>=1 && price<=100){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
if (length>=10 && length<=50){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
	
	}
		
}


