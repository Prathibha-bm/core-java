class CricketStore {

	Cricket[] cricketArray = new Cricket[20];
	int index = 0;

	void save(Cricket cricket){

		if(cricket != null){

			if(this.index < this.cricketArray.length){

				System.out.println("Cricket is not null we can store info");

				this.cricketArray[this.index] = cricket;
				System.out.println("Cricket stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Cricket cannot be null");
		}
	}

	void display(){

		if(this.cricketArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.cricketArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.cricketArray[start].info();
				}
			    }
	}
	 else{
		System.out.println("array is null");
		}
	}
}