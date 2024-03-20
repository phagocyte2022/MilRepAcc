package org.uamil.repacc.staff.domain.militaryDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "mil_certificate")
public class MilCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mil_certificate_id")
    private Long milCertificateId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "military_details_id")
    private MilitaryDetails militaryDetails;

    private enum MilitaryCertificateType{
        приписне_посвідчення,
        тимчасове_посвідчення,
        військовий_квиток
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "mil_certificate_type")
    private MilitaryCertificateType militaryCertificateType;

    @Column(name = "mil_certificate_seria")
    private String milCertificateSeria;

    @Column(name = "mil_certificate_number")
    private String milCertificateNumber;

    @Column(name = "mil_certificate_issued_by")
    private String milCertificateIssuedBy;

    @Column(name = "mil_certificate_issue_date")
    private LocalDate milCertificateIssueDate;

}
