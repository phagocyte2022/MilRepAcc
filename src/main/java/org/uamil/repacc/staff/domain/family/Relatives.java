package org.uamil.repacc.staff.domain.family;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;
import org.uamil.repacc.staff.domain.Serviceman;
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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "serviceman_id")
    private Serviceman serviceman;

    @Column(name = "label")
    private String label;

    @JsonManagedReference
    @OneToOne (mappedBy = "relatives")
    private Address address;

    @JsonManagedReference
    @OneToMany(mappedBy = "relatives")
    private List<PhoneNumber> phoneNumber;

    @Column(name = "occupation")
    private String occupation;

}
