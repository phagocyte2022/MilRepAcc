package org.uamil.repacc.staff.domain.militaryDetails;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "military_details_id")
    private MilitaryDetails militaryDetails;

    @Column(name = "contract_seria")
    private String contractSeria;

    @Column(name = "contract_number")
    private String contractNumber;

    @Column(name = "contract_issue_date")
    private LocalDate contractIssueDate;

    @Column(name = "contract_expiry_date")
    private LocalDate contractExpiryDate;

}
