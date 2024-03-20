package org.uamil.repacc.staff.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @JsonManagedReference
    @OneToMany (mappedBy = "serviceman")
    private List <Address> address;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List<PhoneNumber> phoneNumber;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List<Passport> passport;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List<Education> education;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List <Jobs>jobList;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List <Relatives> relatives;

    @JsonManagedReference
    @OneToOne(mappedBy = "serviceman")
    private MilitaryDetails militaryDetails;

    @Column(name = "blood_type")
    private String bloodType;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List <Religion>religion;

    @JsonManagedReference
    @OneToMany(mappedBy = "serviceman")
    private List <DrivingDetails>drivingDetails;


}
