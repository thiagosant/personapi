package com.sansoft.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    // Primary key to ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //First Name NOT NULL
    @Column(nullable = false)
    private String firstName;

    //Last Name NOT NULL
    @Column(nullable = false)
    private String lastName;

    //CPF NOT NULL and Unique
    @Column(nullable = false, unique = true)
    private String cpf;


    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;
}
