package com.example.BookHub.Repository;

import java.util.*;

import com.example.BookHub.model.Author;
import com.example.BookHub.model.Book;
import com.example.BookHub.model.Publisher;

public interface BookRepository {
    ArrayList<Book> getBooks();

    Book getBookById(int bookId);

    Book addBook(Book book);

    Book updateBook(int bookId, Book book);

    void deleteBook(int bookId);

    Publisher getBookPublisher(int bookId);

    List<Author> getBookAuthors(int bookId);
}