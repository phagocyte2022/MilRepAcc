package org.uamil.repacc.staff.domain.militaryDetails;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "combat_certificate")
public class CombatCertificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "combat_certificate_id")
    private Long CombatCertificateId;

    @ManyToOne
    @JoinColumn(name = "military_details_id")
    private MilitaryDetails militaryDetails;

    @Column(name = "combat_certificate_seria")
    private String CombatCertificateSeria;

    @Column(name = "combat_certificate_number")
    private String CombatCertificateNumber;

    @Column(name = "combat_certificate_issue_date")
    private LocalDate CombatCertificateIssueDate;

}
