package org.uamil.repacc.staff.domain.personal;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passport_id")
    private Long passportId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "passport_seria")
    private String passportSeria;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "passport_issue_date")
    private LocalDate passportIssueDate;

    @Column(name = "passport_expiry_date")
    private LocalDate passportExpiryDate;

}
