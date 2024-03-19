package org.example.service.impl;

import org.example.model.Book;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public void deleteById(java.lang.Long id) {
        this.bookRepository.deleteById(id);
    }

    @Override
    public Optional<Book> edit(java.lang.Long id, ProductDto productDto) {
        return null;
    }

    @Override
    public Optional<Book> edit(java.lang.Long id, java.lang.String name, java.lang.Double price, java.lang.Integer quantity, java.lang.Long category, java.lang.Long manufacturer) {
        return null;
    }

    @Override
    public Optional<Book> save(java.lang.String name, java.lang.Double price, java.lang.Integer quantity, java.lang.Long category, java.lang.Long manufacturer) {
        return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return this.bookRepository.findById(id);
    }
}
