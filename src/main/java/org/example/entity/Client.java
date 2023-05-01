package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(generator = "clients_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "clients_gen", sequenceName = "clients_seq",
            allocationSize = 1)
    private Long id;
    private String fullName;
    private String phoneNumber;
    @ManyToMany
    private List<Bank> banks;
    @OneToOne
    private Passport passport;

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Client(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
}
