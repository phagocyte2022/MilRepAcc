package org.uamil.repacc.staff.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.uamil.repacc.staff.domain.contacts.Address;
import org.uamil.repacc.staff.domain.contacts.PhoneNumber;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long personId;

    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;

    @OneToOne (mappedBy = "person")
    private Address registeredAddress;

    @OneToOne (mappedBy = "person")
    private Address actualAddress;

    @OneToMany(mappedBy = "person")
    private List<PhoneNumber> phoneNumber;
}
