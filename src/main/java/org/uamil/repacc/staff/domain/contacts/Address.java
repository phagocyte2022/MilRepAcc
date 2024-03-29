package org.uamil.repacc.staff.domain.contacts;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;
import org.uamil.repacc.staff.domain.Serviceman;
import org.uamil.repacc.staff.domain.family.Relatives;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "serviceman_id")
    private Serviceman serviceman;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "relatives_id")
    private Relatives relatives;

    @Column(name = "address_label")
    private String addressLabel;

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
