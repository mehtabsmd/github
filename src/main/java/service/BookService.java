package service;

import daorepository.BookDAO;
import entitymodelpojo.Book;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public static void main(String[] args){
        BookService bookService = new BookService();
       System.out.println(bookService.getBooksinSort());
    }

    private List<Book> getBooksinSort() {
        BookDAO bookDAO = new BookDAO();
        List<Book> sortedBooks = bookDAO.getBooks();
        Collections.sort(sortedBooks,(o1,o2) -> o1.getName().compareTo(o2.getName()));
        return sortedBooks;

    }

    }



