package com.book.rental.bookrental.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "cart")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bookName;
    private String userId;
}
