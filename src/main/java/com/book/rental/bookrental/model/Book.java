package com.book.rental.bookrental.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private Integer count;
}
