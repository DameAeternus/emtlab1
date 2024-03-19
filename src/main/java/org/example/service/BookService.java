package org.example.service;

import org.example.model.Book;
import org.example.model.Category;

import java.util.List;
import java.util.Optional;


public interface BookService {
    List<Book> findAll();
    Optional<Book> findById(Long id);
    Optional<Book> save(String name, String name, Category category, String author, Integer AvailableCopies);


    Optional<Book> edit(Long id,String name, String name, Category category, String author,Integer AvailableCopies);

    Optional<Book> edit(Long id, BookDto bookDto);
    void deleteById(Long id);
}
