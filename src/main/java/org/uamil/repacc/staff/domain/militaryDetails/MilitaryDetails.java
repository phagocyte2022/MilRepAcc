package org.uamil.repacc.staff.domain.militaryDetails;

import jakarta.persistence.*;
import lombok.*;
import org.uamil.repacc.staff.domain.Person;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MilitaryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "military_details_id")
    private Long militaryServiceId;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "position")
    private String position;

    @Enumerated(EnumType.STRING)
    @Column(name = "military_rank_group")
    private MilitaryRankGroup militaryRankGroup;

    @Enumerated(EnumType.STRING)
    @Column(name = "military_rank")
    private MilitaryRank militaryRank;

    public enum MilitaryRankGroup {
        солдати,
        сержанти,
        офіцери;
    }

    public enum MilitaryRank {
        рекрут,
        курсант,
        солдат,
        старший_солдат,
        молодший_сержант,
        сержант,
        старший_сержант,
        головний_сержант,
        штаб_сержант,
        майстер_сержант,
        старший_майстер_сержант,
        головний_майстер_сержант,
        молодший_лейтенант,
        лейтенант,
        старший_лейтенант,
        капітан,
        майор,
        підполковник,
        полковник,
        бригадний_генерал,
        генерал_майор,
        генерал_лейтенант,
        генерал
    }

    @OneToMany(mappedBy = "militaryDetails")
    private List<MilCertificate> milCertificate;

    @OneToMany(mappedBy = "militaryDetails")
    private List<CombatCertificate> CombatCertificate;

    @Column(name = "contract_signed")
    private boolean contractSigned;

    @OneToMany(mappedBy = "militaryDetails")
    private List <Contract> contract;

}
