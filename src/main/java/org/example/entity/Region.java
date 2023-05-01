package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table (name = "regions")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Region {
    @Id
    @GeneratedValue(generator = "regions_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "regions_gen", sequenceName = "regions_seq",
            allocationSize = 1)
    private Long id;
    private String regionName;

    public Region(String regionName) {
        this.regionName = regionName;
    }
}
