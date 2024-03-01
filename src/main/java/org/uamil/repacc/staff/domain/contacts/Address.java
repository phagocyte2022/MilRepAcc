package org.uamil.repacc.staff.domain.contacts;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_id")
    private Long addressId;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "post_code")
    private String postCode;

    @Column(name = "country")
    private String country;

    @Column(name = "region")
    private String region;

    @Column(name = "district")
    private String district;

    @Column(name = "settlement")
    private String settlement;

    @Column(name = "street")
    private String street;

    @Column(name = "building")
    private String building;

    @Column(name = "extension")
    private String extension;

    @Column(name = "apartment")
    private String apartment;

}
