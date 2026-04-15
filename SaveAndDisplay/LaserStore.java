class LaserStore {

	Laser[] laserArray = new Laser[20];
	int index = 0;

	void save(Laser laser){

		if(laser != null){

			if(this.index < this.laserArray.length){

				System.out.println("Laser is not null we can store info");

				this.laserArray[this.index] = laser;
				System.out.println("Laser stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Laser cannot be null");
		}
	}

	void display(){

		if(this.laserArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.laserArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.laserArray[start].info();
				}
			}
		   }
		    else{
		System.out.println("array is null");
		}
	}
}