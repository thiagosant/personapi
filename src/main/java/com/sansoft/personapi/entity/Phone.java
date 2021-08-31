package com.sansoft.personapi.entity;

import com.sansoft.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    // Primary key to ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Enum Type to phone type NOT NULL
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    // Number NOT NULL
    @Column(nullable = false)
    private String number;

}
