package org.uamil.repacc.staff.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.uamil.repacc.staff.domain.contacts.Address;
import org.uamil.repacc.staff.domain.contacts.PhoneNumber;
import org.uamil.repacc.staff.domain.family.Relatives;
import org.uamil.repacc.staff.domain.militaryDetails.MilitaryDetails;
import org.uamil.repacc.staff.domain.personal.Passport;
import org.uamil.repacc.staff.domain.professional.Education;
import org.uamil.repacc.staff.domain.professional.Jobs;
import org.uamil.repacc.staff.domain.religion.Religion;
import org.uamil.repacc.staff.domain.vehicles.DrivingDetails;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "serviceman")
@NoArgsConstructor
@AllArgsConstructor
public class Serviceman extends Person {


    @Column(name = "tax_code")
    private String taxCode;

    @OneToMany (mappedBy = "serviceman")
    private List <Address> address;

    @OneToMany(mappedBy = "serviceman")
    private List<PhoneNumber> phoneNumber;

    @OneToMany(mappedBy = "serviceman")
    private List<Passport> passport;

    @OneToMany(mappedBy = "serviceman")
    private List<Education> education;

    @OneToMany(mappedBy = "serviceman")
    private List <Jobs>jobList;

    @OneToMany(mappedBy = "serviceman")
    private List <Relatives> relatives;

    @OneToOne(mappedBy = "serviceman")
    private MilitaryDetails militaryDetails;

    @Column(name = "blood_type")
    private String bloodType;

    @OneToMany(mappedBy = "serviceman")
    private List <Religion>religion;

    @OneToMany(mappedBy = "serviceman")
    private List <DrivingDetails>drivingDetails;

}
