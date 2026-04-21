class FarmHouseChild extends FarmHouse{

@Override
void display(int no){
	 System.out.println("\nFarmHouse Number :"+no);
	 
 }
 
@Override
void display(String farmtype){
	 System.out.println("\nFarmtype :"+farmtype);
 }
 
@Override 
void display(String ownerName,String location){
	 System.out.println("\nOwnerName :"+ownerName);
	 System.out.println("location :"+location);
 }

 
}