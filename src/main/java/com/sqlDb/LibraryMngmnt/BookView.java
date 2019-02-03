package com.sqlDb.LibraryMngmnt;

import java.util.Scanner;

public class BookView {
	public static Scanner dot1 = new Scanner(System.in);
	public static Scanner dot2 = new Scanner(System.in);

	public static void main(String[] args) {

		BookController bookController = new BookController();
		while (true) {
			System.out.println("Please Enter your choice:");
			System.out.println(
					"1. Add Book Info \n2. Delete Book info \n3. Update Book Info \n4. view Book Info \n5. Exit");
			int x = dot1.nextInt();

			if (x == 1) {
				bookController.add();

			} else if (x == 2) {
				bookController.delete();
			} else if (x == 3) {
				bookController.update();
			} else if (x == 4) {
				bookController.display();
			} else if (x == 5) {
				System.out.println("Thanks");
				break;

			}

		}
	}
}
