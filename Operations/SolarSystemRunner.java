class SolarSystemRunner {
	
	public static void main(String... args){
		
		SolarSystem solarSystem=new SolarSystem();
		solarSystem.savePlanets("Mercury");
		solarSystem.savePlanets("Venus");
		solarSystem.savePlanets("Earth");
		solarSystem.savePlanets("Mercury");
		solarSystem.savePlanets("Jupiter");
		solarSystem.savePlanets("Satrin");
		solarSystem.savePlanets("Urenus");
		solarSystem.savePlanets("Neptune");
		
		solarSystem.savePlanets("Plueto");
		solarSystem.savePlanets(null);
	
	    solarSystem.searchPlanet("Urenus");
		solarSystem.searchPlanet("Plueto");
		
		
		
		
		
}
}