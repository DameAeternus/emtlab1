package org.example.model.views;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Data
@Entity
@Subselect("SELECT * FROM public.books_per_category")
@Immutable
public class BookPerCategory {
    @Id
    @Column(name="category_id")
    private Long categoryId;
    @Column(name="availableCopies")
    private Integer availableCopies;
}
