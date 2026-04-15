class BroccoliStore {

	Broccoli[] broccoliArray = new Broccoli[20];
	int index = 0;

	void save(Broccoli broccoli){

		if(broccoli != null){

			if(this.index < this.broccoliArray.length){

				System.out.println("Broccoli is not null we can store info");

				this.broccoliArray[this.index] = broccoli;
				System.out.println("Broccoli stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Broccoli cannot be null");
		}
	}

	void display(){

		if(this.broccoliArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.broccoliArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.broccoliArray[start].info();
				}
			}
			}
			 else{
		System.out.println("array is null");
		}	
	}
}