class WaterMelonStore{

	WaterMelon[] waterMelons=new WaterMelon[2];
	int index=0;
	
	void save(WaterMelon waterMelon){
		if (name!=null){
			if (this.index<this.waterMelons.length){
			 system.out.println("name is not null we can store ingo");
			 
			 this.waterMelons[this.index]=waterMelon;
			 System.out.println("name is stored in index:"+this.index);
			 this.index++;
			}
			else{
				System.out.println("Array is full");
			}
			
		}
		else{
			System.out.println("Name cannot be null,please provide name");
		}
	}
	
	



}