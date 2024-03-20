package org.uamil.repacc.staff.domain.vehicles;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "driving_license")
public class DrivingLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driving_license_id")
    private Long drivingLicenseId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "driving_details_id")
    private DrivingDetails drivingDetails;

    @Column(name = "driving_license_seria")
    private String drivingLicenseSeria;

    @Column(name = "driving_license_number")
    private String drivingLicenseNumber;

    @Column(name = "driving_license_issue_date")
    private LocalDate drivingLicenseIssueDate;

    @Column(name = "driving_license_expiry_date")
    private LocalDate drivingLicenseExpiryDate;

    @JsonManagedReference
    @OneToOne(mappedBy = "drivingLicense")
    private DrivingCategories drivingCategories;

}
