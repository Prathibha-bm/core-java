class PaintChild extends  Paint{
	
@Override
void display(int no){
	 System.out.println("\n Paint code :"+no);
	 
 }
 
@Override
void display(String brand){
	 System.out.println("\n Brand :"+brand);
 }
 
@Override
void display(String brand,double price){
	 System.out.println("\n brand :"+brand);
	 System.out.println("\n price :"+price);
 }
	
}