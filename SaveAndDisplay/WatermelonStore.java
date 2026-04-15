class WatermelonStore{

	WaterMelon[] waterMelons=new WaterMelon[20];
	int index=0;
	
	void save(WaterMelon waterMelon){
		if (waterMelon!=null){
			if (this.index<this.waterMelons.length){
			 System.out.println("\nName is not null we can store info");
			 
			 this.waterMelons[this.index]=waterMelon;
			 System.out.println("Name is stored in index:"+this.index);
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
	
	
void display(){
		
		boolean found=false;
		if(waterMelons!=null){
	
			
			System.out.println("\n********Not null we can do display operation******");
			for(int start=0;start<this.index;start++){
				if(this.waterMelons[start]!=null){
					System.out.println("\n---Element at index ---" + start);
					this.waterMelons[start].info();
            }
        }
    } 
	else {
        System.out.println("\nArray is null");
    }
}
}
			