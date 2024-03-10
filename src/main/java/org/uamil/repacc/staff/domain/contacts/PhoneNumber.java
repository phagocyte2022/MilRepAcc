package org.uamil.repacc.staff.domain.contacts;

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
@Table(name = "phone_number")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_number_id")
    private Long phoneNumberId;

    @ManyToOne
    @JoinColumn(name = "person_id", insertable=false, updatable=false)
    private Serviceman serviceman;

    @ManyToOne
    @JoinColumn(name = "person_id", insertable=false, updatable=false)
    private Relatives relatives;

    @Column(name = "phone_number")
    private String phoneNumber;

}
