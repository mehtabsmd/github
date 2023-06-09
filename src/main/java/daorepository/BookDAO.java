package daorepository;

import entitymodelpojo.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(5, "zorejava", 400));
        books.add(new Book(2, "spring", 500));
        books.add(new Book(3, "sql", 600));
        return books;

    }
}
