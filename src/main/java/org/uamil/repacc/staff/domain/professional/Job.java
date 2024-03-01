package org.uamil.repacc.staff.domain.professional;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long jobId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "employer")
    private String employer;

    @Column(name = "job_title")
    private String jobTitle;

}
