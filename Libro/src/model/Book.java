package model;

public class Book {
	
	private int isbn;
	private String title;
	private String autor;
	private int numpages;
	
	public Book(int isbn, String title , String autor , int numpages) {
		this.isbn= isbn;
		this.title= title;
		this.autor= autor;
		this.numpages= numpages;
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumpages() {
		return numpages;
	}

	public void setNumpages(int numpages) {
		this.numpages = numpages;
	}
	
	public String toString() {
		String info="";
		info= "Book's info:\n"+
				"isbn: "+isbn+"\n"+
				"Title: "+title+"\n"+
				"Autor: "+autor+"\n"+
				"Number of pages: "+numpages;
		return info;
	}
	
	
	
	

}
