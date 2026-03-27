class PlayStationRun{
	
	public static void main(String[] args){
		PlayStation instance1=new PlayStation();
		PlayStation instance2=new PlayStation();
		PlayStation instance3=new PlayStation();
		PlayStation instance4=new PlayStation();
		PlayStation instance5=new PlayStation();

		System.out.println("\nDeafult value\n ");
		System.out.println("Owner: "+ instance1.owner);
		System.out.println("Current Generation: "+instance2.currentGen);
		System.out.println("Headquarter: "+instance3.headquarter);
		System.out.println("Price: "+instance4.price);
		System.out.println("Is for Gaming: "+instance5.isGaming);
		
		instance1.owner="Sony Interactive Entertainment (SIE)";
		instance2.currentGen="PlayStation 5";
		instance3.headquarter="San Mateo, California";
		instance4.price=17;
		instance5.isGaming=true;
		
		
		System.out.println("\nDeafult value\n Owner: "+ instance1.owner);
		System.out.println("Current Generation: "+instance2.currentGen);
		System.out.println("Headquarter: "+instance3.headquarter);
		System.out.println("Price: "+instance4.price);
		System.out.println("Is for Gaming: "+instance5.isGaming);
		
		
	}
}