package org.uamil.repacc.staff.domain.professional;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;
import org.uamil.repacc.staff.domain.Serviceman;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "education_id")
    private Long educationId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Serviceman serviceman;

    @Column(name = "education_level")
    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;
    @Column(name = "speciality")
    private String speciality;

    private enum EducationLevel{
        неповна_середня, середня, базова_вища, вища;
    }
}
