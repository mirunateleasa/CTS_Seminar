package src.designPatterns.prototype.wrong;

import java.util.ArrayList;

public class BookStore {
	private String name;
	private ArrayList <Book> listBooks = new ArrayList<Book>();
	public BookStore(String name, ArrayList<Book> listBooks) {
		super();
		this.name = name;
		this.listBooks = listBooks;
	}
	public BookStore() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getListBooks() {
		return listBooks;
	}
	public void setListBooks(ArrayList<Book> listBooks) {
		this.listBooks = listBooks;
	}
	@Override
	public String toString() {
		return "BookStore [name=" + name + ", listBooks=" + listBooks + "]";
	}
	
	public static BookStore loadDataFromDB (String name)
	{
		BookStore store = new BookStore();
		store.setName(name);
		Book book;
		for (int i = 0; i < 10; i++)
		{
			book = new Book(name + "-" + (i+1), "miruna", i*100);
			store.listBooks.add(book);
			book = null;
		}
		
		return store;
	}
}
