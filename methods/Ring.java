class Ring{
	
	static void details(){
		double weight=15.6;
		float diameter=2;
		int cost=100000;
		int noOFStones=56;
		boolean isGold=true;
		
		System.out.println("\nWeight: "+weight);
		System.out.println("\nprice: "+diameter);
		System.out.println("\nLength: "+cost);
		System.out.println("\nWeight: "+noOFStones);
		System.out.println("\nWeight: "+isGold);


	}
	
	static void info(double weight,float diameter,int cost,int noOFStones,boolean isGold){
		System.out.println("weight: "+weight);
		System.out.println("diameter: "+diameter);
		System.out.println("cost: "+cost);
		System.out.println("noOFStones: "+noOFStones);
		System.out.println("isGold: "+isGold);
		

if (weight>=10 && weight<=100){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}


if (diameter>=1 && diameter<=10){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}

if (cost>=100 && cost<=500){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}


if (noOFStones>=10 && noOFStones<=100){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
if (isGold==true && isGold==true){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
	
		}
}