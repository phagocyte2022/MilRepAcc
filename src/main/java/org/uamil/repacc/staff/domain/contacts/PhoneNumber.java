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
@Table(name = "phone_number")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_number_id")
    private Long phoneNumberId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "phone_number")
    private String phoneNumber;

}
