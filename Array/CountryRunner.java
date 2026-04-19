class CountryRunner{
	
	public static void main(String[] args){
		
		
		Collector collector=new Collector("Meena Nagaraj",203);
		Collector collector1=new Collector("Shri. Jagadeesha G",853);
		
		
		Collector collectorUSA1=new Collector("Colonel Robert B. Marshall",203);
		Collector collectorUSA2=new Collector("Dave Ortiz ",469);
		

		District d1=new District("Chikkamagaluru",collector);
		District d2=new District("Bengaluru",collector1);
		
		District d3=new District("Central Valley",collectorUSA1);
		District d4=new District("Northern California)",collectorUSA2);
		
		District[] districsts={d1,d2};
		District[] districstsUSA={d3,d4};
		
		
		
		City city=new City("Chikkamagaluru",31,districsts);
		City cityUSA=new City("Los Angeles",58,districstsUSA);
		
	
		State state1=new State("Karnataka",6402122,city);
		State state2=new State("Karnataka",577146,city);
		
		State state3=new State("California ",345431,cityUSA);
		State state4=new State("Sacramento ",245665,cityUSA);
		
		State[] states={state1,state2};
		State[] statesInUSA={state3,state4};
		
		
		Address address =new Address(10,577146,state1);
		Address addressUSA =new Address(32,787146,state3);
		
		President president=new President("Drupadi Murmu",48,address);
		President presidentUSA=new President("Trump",58,addressUSA);
		
		Country country1=new Country("India",president,states);
		Country country2=new Country("USA",presidentUSA,statesInUSA);
	
		
		country1.info();	
		country2.info();
		
		
		CountryStore countryStore=new CountryStore();
		
		countryStore.save(country1);
		countryStore.save(country2);
		countryStore.save(null);
		
		
		countryStore.findByName("India");
		
		
		countryStore.findStateByStateName("Karnataka");
		
		countryStore.findAllCityByStateName("USA");
		
		countryStore.findNoOfDistrictsByCityName("Chikkamagaluru");
		
		
		
		//countryStore.findByCollectorName("Meena Nagaraj");
		
	}
}