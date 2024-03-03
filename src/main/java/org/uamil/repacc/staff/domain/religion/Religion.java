package org.uamil.repacc.staff.domain.religion;


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
@Table(name = "religion")
public class Religion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "religion_id")
    private Long religionId;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Serviceman serviceman;

    @Column(name = "religious")
    private boolean religious;

    @Column(name = "religion_type")
    private String religionType;

    @Column(name = "religion_confession")
    private String religionConfession;

    @Column(name = "church")
    private String church;
}
