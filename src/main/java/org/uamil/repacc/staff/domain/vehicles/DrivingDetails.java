package org.uamil.repacc.staff.domain.vehicles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Serviceman;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "serviceman_id")
    private Serviceman serviceman;

    @JsonManagedReference
    @OneToMany(mappedBy = "drivingDetails")
    private List<DrivingLicense> drivingLicense;

    @JsonManagedReference
    @OneToMany(mappedBy = "drivingDetails")
    private List<Vehicles> vehicles;

}
