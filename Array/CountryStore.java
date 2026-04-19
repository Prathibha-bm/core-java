class CountryStore{
	
	Country[] countries=new Country[10];
	int index=0;
	
	void save(Country country){
		
		if(country!= null){
			System.out.println("\n\n-----Running save-----");

			if(this.index < this.countries.length){

				System.out.println("Country is not null we can store info :)");

				this.countries[this.index] = country;
				System.out.println("country is stored in index: "+this.index);
			
				this.index++;
			}
			else{
				System.out.println("\nArray is full");
			}
		}

		else{
			System.out.println(" \ncountry cannot be null :(");
		}
	}
	
	
	
Country findByName(String name){
		
		if(name!=null){
			System.out.println("\n=======name is not null,we can find ==========");
			
			for(Country country:this.countries){
				if(country!=null && name.equals(country.name)){
					System.out.println("found by name :"+name);
				return country;
				}
			}
		}
		return null;
			
		}
			
			
			
State findStateByStateName(String name){
	if(name!=null){
		System.out.println("\n=======name is not null,we can find by state name ==========");
		
		for(Country country:this.countries){
        if(country!=null){
			for(State state:country.states ){
				if(state!=null && name.equals(state.name)){
					System.out.println("found by name :"+name);
					return state;
				}
				
			
				
			}
	}
 }
 
}
return null;
}


City[] findAllCityByStateName(String name){
	
	for (Country country:this.countries){
		if (country!=null){
			for(State state:country.states){
				if(state!=null && name.equals(state.name)){
					System.out.println("\nfound by name :"+name);
					return new City[] {state.city};
				}
		}
	}	
}
return null;
}

int findNoOfDistrictsByCityName(String name){
	for (Country country:this.countries){
		if (country!=null){
			for(State state:country.states){
				if(state!=null && name.equals(state.city.name)){
					System.out.println("\nFound");
					return state.city.noOfDistricts;
				}
			}
		}
	}
	return 0;
	}
}


/*Country findByCollectorName(String name){
	 for (Country country:this.countries){
		if (country!=null){
			
			for(State state:country.states){
				if(state!=null ){
					
					for(City city=state.city)
						for(District districet:city.district){
							
						if(dist!=null && name.equals(dist.collector.name)){
					return country;
					
 }
						}
				}
			}
		}
	 }
	 return null;
 }*/
 

	
	
