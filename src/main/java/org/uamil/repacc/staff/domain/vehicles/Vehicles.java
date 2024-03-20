package org.uamil.repacc.staff.domain.vehicles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vehicle_id")
    private Long vehicleId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "driving_details_id")
    private DrivingDetails drivingDetails;

    @Column(name = "vehicle_number_plate")
    private String numberPlate;
    @Column(name = "vehicle_produce")
    private String vehicleProduce;
    @Column(name = "vehicle_model")
    private String vehicleModel;
    @Column(name = "vehicle_color")
    private String vehicleColor;
}
