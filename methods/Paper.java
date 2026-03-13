class Paper{
	static void details(){
		float height=18.34f;
		double weight=10;
		int cost=20;
		boolean goodQuality=true;
		float width=0.22f;
		System.out.println("height: "+height);
		System.out.println("weight: "+weight);
		System.out.println("cost: "+cost);		
		System.out.println("goodQuality: "+goodQuality);
		System.out.println("width: "+width);

	}
	
	static void feature(float height,double weight,int cost,boolean goodQuality,float width){
		System.out.println("height: "+height);
		System.out.println("weight: "+weight);
		System.out.println("cost: "+cost);		
		System.out.println("goodQuality: "+goodQuality);
		System.out.println("width: "+width);
		


if (height>=1 && height<=10){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}


if (weight>=1 && weight<=100){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
if (cost>=10 && cost<=500){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}

if (goodQuality==true && goodQuality==true){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
if (width>=1 && width<=20){
	System.out.println("Valid");
}
else{
	System.out.println("Invalid");
}
	}
	}
		