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
@Table(name = "phone_number")
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_number_id")
    private Long phoneNumberId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "serviceman_id")
    private Serviceman serviceman;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "relatives_id")
    private Relatives relatives;

    @Column(name = "phone_number")
    private String phoneNumber;

}
