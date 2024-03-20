package org.uamil.repacc.staff.domain.professional;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Serviceman;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jobs")
public class Jobs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long jobId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "serviceman_id")
    private Serviceman serviceman;

    @Column(name = "employer")
    private String employer;

    @Column(name = "job_title")
    private String jobTitle;

}
