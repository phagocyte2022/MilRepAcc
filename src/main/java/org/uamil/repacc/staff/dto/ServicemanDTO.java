package org.uamil.repacc.staff.dto;

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
@NoArgsConstructor
@AllArgsConstructor
public class ServicemanDTO {

    private Long personId;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String taxCode;
    private List<Address> addresses;
    private List<PhoneNumber> phoneNumbers;
    private List<Passport> passports;
    private List<Education> educations;
    private List<Jobs> jobs;
    private List<Relatives> relatives;
    private MilitaryDetails militaryDetails;
    private String bloodType;
    private List<Religion> religions;
    private List<DrivingDetails> drivingDetails;

}
