package com.book.rental.bookrental.model;

import lombok.*;

import javax.persistence.*;

@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@Column(name = "userName")
    private String userName;
    private String name;
    private String email;

}
