class BookRunner{

public static void main(String... args){
	 
	 Book book =new Book();
	 book.saveBookName("Power of subconcious mind");
	 book.saveBookName("Ramayana");
	 book.saveBookName("Harry poter");
	 book.saveBookName("5am club");
	 book.saveBookName("Power");
	 
	 book.saveBookName("Power0");
	 
	 book.saveBookName(null);
	 
	 book.searchBook("Power");
	 book.searchBook("Power of 1");
	 

}
}