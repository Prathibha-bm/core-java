class TissueStore{

	Tissue[] tissueArray = new Tissue[20];
	int index = 0;

	void save(Tissue tissue){

		if(tissue != null){

			if(this.index < this.tissueArray.length){

				System.out.println("Tissue is not null we can store info");

				this.tissueArray[this.index] = tissue;
				System.out.println("Tissue stored in index: "+this.index);
				this.index++;

			}else{
				System.out.println("Array is full");
			}

		}else{
			System.out.println("Tissue cannot be null");
		}
	}

	void display(){

		if(this.tissueArray != null){

			System.out.println("\nNot null we can do display operation");

			for(int start=0; start<this.index; start++){

				if(this.tissueArray[start] != null){

					System.out.println("\nElement at index "+start);
					this.tissueArray[start].info();
				}
			}
		  }
		  else{
		System.out.println("array is null");
	}
		  }
	  }
