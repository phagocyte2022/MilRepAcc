package org.uamil.repacc.staff.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.uamil.repacc.staff.domain.family.Relatives;
import org.uamil.repacc.staff.domain.militaryDetails.MilitaryDetails;
import org.uamil.repacc.staff.domain.personal.Passport;
import org.uamil.repacc.staff.domain.professional.Education;
import org.uamil.repacc.staff.domain.professional.Job;
import org.uamil.repacc.staff.domain.religion.Religion;
import org.uamil.repacc.staff.domain.vehicles.DrivingDetails;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "serviceman")
public class Serviceman extends Person {

    @Column(name = "birthDate")
    private LocalDate birthDate;

    @Column(name = "tax_code")
    private String taxCode;

    @OneToMany(mappedBy = "person")
    private List<Passport> passport;

    @OneToMany(mappedBy = "person")
    private List<Education> education;

    @OneToMany(mappedBy = "person")
    private List <Job>jobList;

    @OneToMany(mappedBy = "person")
    private List <Relatives> relatives;

    @OneToOne(mappedBy = "person")
    private MilitaryDetails militaryDetails;

    @Column(name = "blood_type")
    private String bloodType;

    @OneToMany(mappedBy = "person")
    private List <Religion>religion;

    @OneToMany(mappedBy = "person")
    private List <DrivingDetails>drivingDetails;

}
