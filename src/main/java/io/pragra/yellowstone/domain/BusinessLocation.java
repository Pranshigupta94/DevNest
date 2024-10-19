package io.pragra.yellowstone.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "table_business_location")
@Data
public class BusinessLocation extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(generator = "locationSeq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "locationSeq")
    private Long id;

    private int streetNo;
    private String streetName;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String locationType;

    public Long getId() {
        return id;
    }
}
