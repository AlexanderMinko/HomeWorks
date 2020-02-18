package com.itbulls.learnit.Minko.HW5;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int publishYear;
	private int numberOfPages;
	private int price;
	private String typeOfBinding;

	public Book(int id, String name, String author, String publisher, int publishYear, int numberOfPages, int price,
			String typeOfBinding) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.publishYear = publishYear;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.typeOfBinding = typeOfBinding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getpublisher() {
		return publisher;
	}

	public void setPublishedBy(String publisher) {
		this.publisher = publisher;
	}

	public int publishYear() {
		return publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(String numberOfPages) {
		this.author = numberOfPages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTypeOfBinding() {
		return typeOfBinding;
	}

	public void setTypeOfBinding(String typeOfBinding) {
		this.typeOfBinding = typeOfBinding;
	}

	@Override
	public String toString() {
		String text = "";
		text += "Id is " + this.id;
		text += ", name is " + this.name;
		text += ", author is " + this.author;
		text += ", publisher is " + this.publisher;
		text += ", publish year is " + this.publishYear;
		text += ", number of pages is " + this.numberOfPages;
		text += ", price is " + this.price;
		text += ", typeOfBinding is " + this.typeOfBinding;
		return text;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter author: ");
		String getAuthor = r.readLine();
		System.out.print("Enter publiser: ");
		String getPublisher = r.readLine();
		System.out.print("Enter publish year: ");
		int publishedAfter = Integer.parseInt(r.readLine());
		List<Book> books = myBooks();
		System.out.println("List of books by author: " + getAuthor);
		getBookByAuthor(getAuthor, books);
		System.out.println();
		System.out.println("List of books pyblishedBy: " + getPublisher);
		getBookByPublisher(getPublisher, books);
		System.out.println();
		System.out.println("List of books by pyblishedAfterYear: " + publishedAfter);
		getBookAfterYear(publishedAfter, books);
	}

	private static List<Book> myBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(0, "Privet", "Zdarova", "KakDela", 1991, 322, 101, "Wooden"));
		books.add(new Book(1, "Davai", "Pogovorim", "NuChegoTiA", 1488, 999, 1, "Steal"));
		books.add(new Book(2, "Ya", "Washe", "Ne", 322, 555, 99, "Steal"));
		books.add(new Book(3, "Znayu", "Sho", "Tut", 2001, 777, 67, "Steal"));
		books.add(new Book(4, "Mozhno", "Napisat", "Poetomy", 1999, 666, 322, "Steal"));
		books.add(new Book(5, "Ostavlu", "Eto", "Tak", 1991, 333, 228, "Steal"));
		books.add(new Book(6, "Kak", "Ono", "Estb", 1986, 111, 1488, "Steal"));
		return books;
	}

	private static void getBookByAuthor(String Author, List<Book> books) {
		int n;
		for (Book i : books) {
			if (i.author.contains(Author)) {
				n = i.id;
				System.out.println(Author + " is an author of this book: " + books.get(n));
			}
		}
	}

	private static void getBookByPublisher(String publisher, List<Book> books) {
		int n;
		for (Book i : books) {
			if (i.publisher.contains(publisher)) {
				n = i.id;
				System.out.println(books.get(n) + ". This book published " + publisher);
			}
		}
	}

	private static void getBookAfterYear(int year, List<Book> books) {
		int n;
		for (Book i : books) {
			if (i.publishYear > year) {
				n = i.id;
				System.out.println(books.get(n) + ". This book published after " + year);
			}
		}
	}
}
