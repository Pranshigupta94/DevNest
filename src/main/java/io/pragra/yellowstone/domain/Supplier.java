package io.pragra.yellowstone.domain;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name = "table_supplier")
@Data
public class Supplier extends AbstractAuditingEntity<Long> {

    @Id
    @GeneratedValue(generator = "supplierSequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "supplierSequence")
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String phone;

    @OneToOne
    @JoinColumn(name = "business_id")
    private BusinessEntity businessEntity;

    public Long getId() {
        return id;
    }
}
