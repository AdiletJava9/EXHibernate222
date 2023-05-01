package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "banks")
@Getter
@Setter
@NoArgsConstructor
public class Bank {
    @Id
    @GeneratedValue(generator = "banks_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "banks_gen", sequenceName = "banks_seq",
            allocationSize = 1)
    private Long id;
    private String name;
    private String address;

    @ManyToMany(cascade = {CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REMOVE,
            CascadeType.REFRESH}, mappedBy = "banks")
    private List<Client> clients;

    public Bank(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
