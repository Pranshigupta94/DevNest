package io.pragra.yellowstone.domain;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "table_business_entity")
public class BusinessEntity extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(generator = "bnSequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "bnSequence")
    private Long id;

    private String name;
    private String legalBusinessName;
    private String businessNumber;
    private String taxId;

    @OneToMany
    @JoinColumn(name = "location_id")
    private List<BusinessLocation> businessLocations;

    public Long getId() {
        return id;
    }
}
