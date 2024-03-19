package org.example.listeners;

import org.example.service.BookService;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BookEventHandlers {
    private final BookService bookService;


    public BookEventHandlers(BookService bookService) {
        this.bookService = bookService;
    }
    @EventListener
    public void onBook
}
