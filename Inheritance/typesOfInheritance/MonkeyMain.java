//checking of instanceof
class MonkeyMain{
public static void main(String... args){

System.out.println("----instanceof----");


Animal animal=new Monkey();

if (animal instanceof Monkey){
System.out.println(" yes ");
	animal.parentClass();
}




}
}