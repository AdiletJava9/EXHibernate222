package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "passport")
@Getter
@Setter
@NoArgsConstructor
public class Passport {
    @Id
    @GeneratedValue(generator = "passports_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "passports_gen", sequenceName = "passports_seq",
            allocationSize = 1)
    private Long id;
    private String INN;

    public Passport(String INN) {
        this.INN = INN;
    }
}
