class SpaceShipStore {

	SpaceShip[] spaceShipArray = new SpaceShip[20];
	int index = 0;

	void save(SpaceShip spaceShip){

		if(spaceShip != null){

			if(this.index < this.spaceShipArray.length){

				System.out.println("SpaceShip is not null we can store info");

				this.spaceShipArray[this.index] = spaceShip;
				System.out.println("SpaceShip stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("SpaceShip cannot be null");
		}
	}

	void display(){

		if(this.spaceShipArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.spaceShipArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.spaceShipArray[start].info();
				}
		}
		}	
      else{
		System.out.println("array is null");
		}		
		
	}
}