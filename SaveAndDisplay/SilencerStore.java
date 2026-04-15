class SilencerStore {

	Silencer[] silencerArray = new Silencer[20];
	int index = 0;

	void save(Silencer silencer){

		if(silencer != null){

			if(this.index < this.silencerArray.length){

				System.out.println("Silencer is not null we can store info");

				this.silencerArray[this.index] = silencer;
				System.out.println("Silencer stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Silencer cannot be null");
		}
	}

	void display(){

		if(this.silencerArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.silencerArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.silencerArray[start].info();
				}
			}
		}
	
	else{
		System.out.println("array is null");
	}
	}
}