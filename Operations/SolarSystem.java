class SolarSystem{
	
	String[] planets=new String[8];
	int index=0;
	
   void savePlanets(String planetName){
	
	if (planets!=null){
		
		if(this.index<this.planets.length){
			System.out.println("\nPlanets are not null we can do save operation");
			
			this.planets[this.index]=planetName;
			
			System.out.println("Planet saved succesfully in index: "+this.index);
			this.index++;
		}
		else{
			System.out.println("\nSpace is full not able to save");
			
		}
	
	}
    else
	{
	System.out.println("!!!!!!!planet name is null we cannot do save operation");
	}	
	
   }
   
   
void searchPlanet(String name){
	 boolean found=false;
	  
	  if(this.planets!=null){
		  
		  for(String temp:this.planets){
				
			if(name==temp){
				System.out.println("\n*****Array is not empty we can do search operation\n");
		  
				System.out.println("\nName found ");
				found=true;
				break;
			}
		  }
			if(!found)
			{
				System.out.println(name+ " Name not found");
			}
		  }
		 
	  else{
		  System.out.println("null");
	  }
  }
}
   
   
   



