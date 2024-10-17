package com.example.BookHub.Repository;

import com.example.BookHub.model.Author;
import java.util.ArrayList;

public interface AuthorRepository {
    ArrayList<Author> getAuthors();

    Author getAuthorById(int authorId);

    Author addAuthor(Author author);

    Author updateAuthor(int authorId, Author author);

    void deleteAuthor(int authorId);
}