package test;

public class Library {
	private static int bookCount = 100;
	protected static int serial = 1;
	protected static String bookName = "aaa";
	private static Library lib = new Library();
	
	private Library() {
		
	}
	
	public static Library getLibrary() {
		return lib;
	}
	
	public String getBook() {
		
	}
	
	public String addBook() {
		
	}
}
