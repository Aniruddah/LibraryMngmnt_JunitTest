package com.sqlDb.LibraryMngmnt;

public class BookModel {

	private  int bookId;
	private  String bookName;
	 String bookAuthorName;
	 int bookQuantity;
	 
	 public BookModel() {
		 
	 }
	 
	public BookModel(int bookId, String bookName, String bookAuthorName, int bookQuantity) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthorName = bookAuthorName;
		this.bookQuantity = bookQuantity;
	}
	public int getId() {
		return bookId;
	}
	public void setId(int id) {
		bookId = id;
	}
	public String getName() {
		return bookName;
	}
	public void setName(String name) {
		bookName = name;
	}
	public String getAuthorName() {
		return bookAuthorName;
	}
	public void setAuthorName(String authorName) {
		bookAuthorName = authorName;
	}
	public int getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(int bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	
	
	
}

