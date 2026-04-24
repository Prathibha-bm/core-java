class Hierarchical{
	
public static void main(String... args){
System.out.println("\n--------Hierarchical Inheritance--------:)");

System.out.println("\nRunning by Dog instance");
Dog dog=new Dog();
dog.parentClass();
dog.subclass();

System.out.println("\nRunning by Cat instance");
Cat cat=new Cat();
cat.parentClass();
cat.catInfo();
}
}