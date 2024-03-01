package org.uamil.repacc.staff.domain.vehicles;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "driving_details")
public class DrivingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driving_details_id")
    private Long drivingDetailsId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @OneToMany(mappedBy = "drivingDetails")
    private List<DrivingLicense> drivingLicense;

    @OneToMany(mappedBy = "drivingDetails")
    private List<Vehicles> vehicles;

}
