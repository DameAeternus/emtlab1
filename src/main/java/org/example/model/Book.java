package org.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Enumerated(value=EnumType.STRING)
    private Category category;
    @ManyToOne
    private Author author;

    private Integer availableCopies;
    public Book(){}

    public Book(String name, Category category, Author author, int availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }
}
