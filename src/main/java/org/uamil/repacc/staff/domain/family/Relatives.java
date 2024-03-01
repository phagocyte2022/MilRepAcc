package org.uamil.repacc.staff.domain.family;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;
import org.uamil.repacc.staff.domain.contacts.Address;
import org.uamil.repacc.staff.domain.contacts.PhoneNumber;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "relatives")
public class Relatives extends Person {

    @ManyToOne
    @JoinColumn(name = "person_id", insertable=false, updatable=false)
    private Person person;

    @Column(name = "label")
    private String label;

    @OneToOne (mappedBy = "person")
    private Address actualAddress;

    @OneToMany(mappedBy = "person")
    private List<PhoneNumber> phoneNumber;

    @Column(name = "occupation")
    private String occupation;

}
