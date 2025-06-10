package org.lexicon.springbot.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.sql.Update;

import java.time.LocalDate;

@AllArgsConstructor // make a default constructor with all args
@NoArgsConstructor  // make a default constructor with no args
@Getter // makes default Getter and Setter
@Setter // makes default Getter and Setter
@ToString // makes default ToString method
@Entity // @Entity marks this class as a database entity. Get its own table in the database.

public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private int id;
    @Column(unique = true, length = 100)
    private String email;
    @Column(length = 70)
    private String name;
    private LocalDate birthdate;

    public Details(String email, String name, LocalDate birthdate) {
        this.email = email;
        this.name = name;
        this.birthdate = birthdate;
    }
}
