package com.sqlDb.LibraryMngmnt;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookControllerTest {

	@Test
	public void testAdd() {
		BookController bookController = new BookController();
		BookModel bookModel = new BookModel();//expected
		bookModel.setId(1);//expected
		bookModel.setName("abcd");//expected
		bookModel.setAuthorName("Ani");//expected
		bookModel.setBookQuantity(4);//expected
		assertEquals(bookModel.getAuthorName(), bookController.add().get(0).getAuthorName());
		assertEquals(bookModel.getName(), bookController.bookList.get(0).getName());
		assertEquals(bookModel.getBookQuantity(), bookController.bookList.get(0).getBookQuantity());
		bookController.display();
	}

	@Test
	public void testDisplay() {
//		BookController bookController=new BookController();
//		bookController.add();
//		
//		BookModel bookModel = new BookModel();//expected
//		bookModel.setId(1);//expected
//		bookModel.setName("abcd");//expected
//		bookModel.setAuthorName("Aniruddha");//expected
//		bookModel.setBookQuantity(4);//expected
//		assertEquals()
		
		
	}

	@Test
	public void testDelete() {
		BookController bookController = new BookController();
		BookModel bookModel = new BookModel();//expected
		bookModel.setId(1);//expected
		bookModel.setName("ab");//expected
		bookModel.setAuthorName("anir");//expected
		bookModel.setBookQuantity(2);//expected
		bookController.add();
		assertTrue(bookController.delete().isEmpty());
		
		
	}

	@Test
	public void testUpdate() {
		BookController bookController = new BookController();
		BookModel bookModel = new BookModel();//expected
		bookModel.setId(2);//expected
		bookModel.setName("ab");//expected
		bookModel.setAuthorName("abc");//expected
		bookModel.setBookQuantity(2);//expected
		bookController.add();
		
		bookModel.setName("abx");//expected
		bookModel.setAuthorName("abcx");//expected
		bookModel.setBookQuantity(3);//expected
		bookController.update();
		
		
		assertEquals(bookModel.getAuthorName(), bookController.bookList.get(0).getAuthorName());
		assertEquals(bookModel.getName(), bookController.bookList.get(0).getName());
		assertEquals(bookModel.getBookQuantity(), bookController.bookList.get(0).getBookQuantity());
	}

}
