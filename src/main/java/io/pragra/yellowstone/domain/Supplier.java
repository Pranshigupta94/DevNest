package io.pragra.yellowstone.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "table_supplier")
public class Supplier {

    @Id
    @GeneratedValue(generator = "supplierSequence", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "supplierSequence")
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;

    private String phone;

    @Transient
    private String noDbCol;
}
